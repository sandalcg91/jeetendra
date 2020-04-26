import java.sql.*;
import java.util.*;
class MSSelectPS
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the customer id : ");
		String cid = sc.next();
		// Load or Register Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// Est. Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");

		// query
		String qry = "select * from customer where custid=?";
		
		// PreparedStatement
		PreparedStatement ps = con.prepareStatement(qry);
		ps.setString(1, cid);
		
		// dispatch qry
		ResultSet rs = ps.executeQuery();
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Cid"+"\t\t"+"Cname"+"\t\t"+"address"+"\t\t\t"+"MobileNo"+"\t\t"+"proid");
		System.out.println("--------------------------------------------------------------------------------------");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
		}		
		con.close();
	}
}