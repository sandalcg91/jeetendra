import java.util.*;
import java.sql.*;
public class MSCreateTable{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			String qry = "create table Mobile(mid int primary key, model varchar(20), mtype varchar(10))";
			Statement st = con.createStatement();
			int n = st.executeUpdate(qry);
			System.out.println(n+" table created");
			con.close();
		}catch(ClassNotFoundException ce){System.out.println(ce);}
		catch(SQLException se){System.out.println(se);}
	}
}