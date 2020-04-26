import java.sql.*;
import java.util.*;
public class Product
{
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	
	Product(int productId, String productName, String productStatus, double price)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","casestudy","sandal");
			ps = con.prepareStatement("insert into products values(?,?,?,?)");
			ps.setInt(1, productId);
			ps.setString(2, productName);
			ps.setString(3, productStatus);
			ps.setDouble(4, price);
			int m = ps.executeUpdate();
			if(m>0){
				System.out.println("Product Details Inserted Successfully");
			}else{
				System.out.println("Product Details not inserted");
			}
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}/*finally{
			try{
				con.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}*/
	}
	
	public static void showBookedProductDetails(int boid)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","casestudy","sandal");
			ps = con.prepareStatement("select * from book_products where b_id = ?");
			ps.setInt(1, boid);
			rs = ps.executeQuery();
			System.out.println("Booked Id"+"\t"+"Customer Id"+"\t"+"Product Name"+"\t"+"Quantity"+"\t"+"Discount"+"\t"+"Total-Amount");
			System.out.println("-------------------------------------------------------------------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t\t"+rs.getInt(2)+"\t\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t\t"+rs.getInt(5)+"\t\t"+rs.getInt(6));
			}
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}/*finally{
			try{
				con.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}*/
	}
}