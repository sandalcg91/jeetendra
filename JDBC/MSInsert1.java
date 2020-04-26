import java.util.*;
import java.sql.*;
public class MSInsert1{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			String cid = args[0];
			String cnm = args[1];
			String cadd = args[2];
			int ccno = Integer.parseInt(args[3]);
			int pid = Integer.parseInt(args[4]);
			String qry = "insert into customer values('"+cid+"','"+cnm+"','"+cadd+"',"+ccno+","+pid+")";
			Statement st = con.createStatement();
			int n = st.executeUpdate(qry);
			System.out.println(n+" Record Inserted");
			con.close();
		}catch(ClassNotFoundException ce){System.out.println(ce);}
		catch(SQLException se){System.out.println(se);}
	}
}