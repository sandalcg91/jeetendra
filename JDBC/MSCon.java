import java.sql.*;
class MSCon
{
	public static void main(String[] args) throws Exception
	{
		// Load or Register Driver
		//Class.forName("com.mysql.jdbc.Driver");
		
		// Est. Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");

		// query
		String qry = "select * from customer";
		
		// statement
		Statement st = con.createStatement();
		
		// dispatch qry
		ResultSet rs = st.executeQuery(qry); //"select * from customer");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Cid"+"\t\t"+"Cname"+"\t\t"+"address"+"\t\t\t"+"MobileNo"+"\t\t"+"proid");
		System.out.println("--------------------------------------------------------------------------------------");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(con.getClass().getName());
		System.out.println(st.getClass().getName());
		System.out.println(rs.getClass().getName());
		
		con.close();
	}
}