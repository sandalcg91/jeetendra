import java.sql.*;
import java.util.*;
public class Customer
{
	Connection con = null;
	PreparedStatement ps = null;
	Scanner sc = null;
	ResultSet rs = null;
	static int cid = 0;
	
	Customer(){}
	
	Customer(int customerId, String customerName, long contactNo)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","casestudy","sandal");
			ps = con.prepareStatement("insert into customer values(?,?,?)");
			ps.setInt(1, customerId);
			ps.setString(2, customerName);
			ps.setLong(3, contactNo);
			int n = ps.executeUpdate();
			if(n>0){
				System.out.println("Record Inserted Successfully");
			}else{
				System.out.println("Record not inserted");
			}
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
	
	public int checkCustomerId(int customerId)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","casestudy","sandal");
			String q = "select cust_id from customer where cust_id =?";
			ps = con.prepareStatement(q);
			ps.setInt(1, customerId);
			rs = ps.executeQuery();
			while(rs.next())
			{
				cid = rs.getInt(1);
			}
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return cid;
	}
}