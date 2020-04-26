import java.sql.*;
import java.util.*;
public class Customer
{
	Connection con = null;
	PreparedStatement ps = null;
	Scanner sc = null;
//	ResultSet rs = null;
	
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
}