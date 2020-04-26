import java.util.*;
import java.sql.*;
public class MSInsert{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			String qry = "insert into customer values('c111','arpit','mig colony',985623147,1003)";
			Statement st = con.createStatement();
			int n = st.executeUpdate(qry);
			System.out.println(n+" Record Inserted");
			con.close();
		}catch(ClassNotFoundException ce){System.out.println(ce);}
		catch(SQLException se){System.out.println(se);}
	}
}