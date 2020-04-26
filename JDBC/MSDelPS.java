import java.sql.*;
import java.util.*;
class MSDelPS
{
	public static void main(String[] args)
	{
		Connection con = null;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the customer id :");
			String cid = sc.next();
			
			// Load or Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Est. Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
		
			// disable auto commit mode on DB S/where
			con.setAutoCommit(false);
			
			// PreparedStatement
			PreparedStatement ps = con.prepareStatement("delete from customer where custid =?");
			ps.setString(1, cid);
			
			// dispatch qry
			int n = ps.executeUpdate();
			
			// commit or rollback
			con.commit();
		//	System.out.println(n+ " Record Deleted successfully");
			if(n==1)
			{
				System.out.println("Record Deleted successfully");
			}
			else
			{
				System.out.println("Record not Deleted");
			}
		}
		catch(ClassNotFoundException ce){System.out.println(ce);}
		catch(SQLException se){System.out.println(se);}
		finally
		{
			try
			{
				con.close();
			}
			catch(SQLException see){System.out.println(see);}
		}
	}
}