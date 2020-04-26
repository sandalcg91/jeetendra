import java.util.*;
import java.sql.*;
public class MSInsertPS{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Student id : ");
			int sid = sc.nextInt();
			System.out.print("Enter Student name : ");
			String snm = sc.next();
			System.out.print("Enter Marks : ");
			int mrk = sc.nextInt();

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			String qry = "insert into Student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1,sid);
			ps.setString(2,snm);
			ps.setInt(3,mrk);
			int n = ps.executeUpdate();
			System.out.println(n+" Record Inserted");
			con.close();
		}catch(ClassNotFoundException ce){System.out.println(ce);}
		catch(SQLException se){System.out.println(se);}
}}