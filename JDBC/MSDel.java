import java.sql.*;
import java.util.*;
class MSDel
{
	public static void main(String[] args)
	{
		Connection con = null;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the customer id :");
			String cid = sc.next();
			
			// Load or Register Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Est. Connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
		
			// disable auto commit mode on DB S/where
			con.setAutoCommit(false);
			
			// statement
			Statement st = con.createStatement();
			
			// dispatch qry
			int n = st.executeUpdate("delete from customer where custid ="+cid);
			
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