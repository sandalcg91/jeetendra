import java.util.*;
import java.sql.*;
public class RetailStore
{
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs =null;
	String storename;
	static int cid = 0;
	static int pid = 0;
	static int proid = 0;
	static int pcnt = 0;
	static int bpro = 0;
	static int bookid = 0;
	static int custid = 0;
	static int bid = 0;
	static int i = 0;
	static String prodnm = "";
	static int qty = 0;
	static double proprice = 0;
	static double TotalAmount = 0;
	static double dis = 0;
	
	RetailStore()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("java:oracle:thin:@localhost:1521/orca","casestudy","sandal");
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}
	}

	public int generateCustomerId()
	{
		try{
			String qry = "select max(cust_id) from customer";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					cid = rs.getInt(1);
				}
			}
		}catch(SQLException se){
			se.printStackTrace();
		}
		return cid+1;
	}
		
	public void addCustomer(String customerName, long contactNo)
	{
		int customerId = generateCustomerId();
		Customer cust = new Customer(customerId, customerName, contactNo);
	}

	public int generateProductId()
	{
		try{
			String qry = "select max(prod_id) from products";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					pid = rs.getInt(1);
				}
			}
		}catch(SQLException se){
			se.printStackTrace();
		}
		return pid+1;
	}
		
	public void addProduct(String productName, String status, double price)
	{
		int productId = generateProductId();
		
		Product prod = new Product(productId, productName, status, price);
	}
	
	public int checkProductAvailability(String productName)
	{
		try{
			String qry = "select count(prodname) from products where status = ? and prodname = ?";
			ps = con.prepareStatement(qry);
			ps.setString(1, "available");
			ps.setString(2, productName);
			rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					pcnt = rs.getInt(1);
				}
			}
		}catch(SQLException se){
			se.printStackTrace();
		}
		return pcnt;
	}
	
	public int bookProduct(int bookedId, int customerId, String productName, int quantity)
	{
		try{
			String qry = "insert into prod_cust_book values(?,?,?,?)";
			ps = con.prepareStatement(qry);
			ps.setInt(1, bookedId);
			ps.setInt(2, customerId);
			ps.setString(3, productName);
			ps.setInt(4, quantity);
			bpro = ps.executeUpdate();
		}catch(SQLException se){
			se.printStackTrace();
		}
		return bpro;
	}
	
	public double calculateNetAmount(int customerId, double discount)
	{
		try{
			// fetch booked id
			String qry = "select b_id from prod_cust_book";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					bookid = rs.getInt(1);
				}
			}
			// fetch b_id, c_id, prodname, quantity according to b_id
			String q1 = "select b_id, c_id, productname, quantity from prod_cust_book where b_id =?";
			ps = con.prepareStatement(q1);
			ps.setInt(1, bookid);
			rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					bookid = rs.getInt(1);
					custid = rs.getInt(2);
					prodnm = rs.getString(3);
					qty = rs.getInt(4);
				}
			}
			
			// fetch price according to prodname
			String q2 = "select price from products where prodname =?";
			ps = con.prepareStatement(q2);
			ps.setString(1, prodnm);
			rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					proprice = rs.getDouble(1);
				}
			}
			dis = (proprice*qty*discount/100);
			TotalAmount = (proprice*qty)-dis;

			// insert details into book_products table
			String q3 = "insert into book_products values(?,?,?,?,?,?)";
			ps = con.prepareStatement(q3);
			ps.setInt(1, bookid);
			ps.setInt(2, customerId);
			ps.setString(3, prodnm);
			ps.setInt(4,qty);
			ps.setDouble(5, discount);
			ps.setDouble(6, TotalAmount);
			ps.executeUpdate();
		
			// deletion
			String q4 = "select prod_id from products where prodname = ?";
			ps = con.prepareStatement(q4);
			ps.setString(1, prodnm);
			rs = ps.executeQuery();
			if(rs!=null)
			{
				while(rs.next())
				{
					proid = rs.getInt(1);
					
					if(i<qty)
					{
						String q5 = "delete from products where prod_id=?";
						ps = con.prepareStatement(q5);
						ps.setInt(1, proid);
						ps.executeUpdate();
						i++;
					}
				}
			}
		i = 0;
		
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return TotalAmount;
	}
}