import java.util.*;
import java.sql.*;
public class MSCreateTable1{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter table name that you have to create : ");
			String tname = sc.next();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			String qry = "create table "+tname+"(sid int(5) primary key, sname varchar(20), marks int(3))";
			Statement st = con.createStatement();
			int n = st.executeUpdate(qry);
			System.out.println(n+" table created");
			con.close();
		}catch(ClassNotFoundException ce){System.out.println(ce);}
		catch(SQLException se){System.out.println(se);}
	}
}