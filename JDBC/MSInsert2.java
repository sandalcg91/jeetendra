import java.util.*;
import java.sql.*;
public class MSInsert2{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			System.out.print("Enter customer id : ");
			String cid = sc.next();
			System.out.print("Enter customer name : ");
			String cnm = sc.next();
			System.out.print("Enter customer address : ");
			String cadd = sc.next();
			System.out.print("Enter customer Contact No : ");
			int ccno = sc.nextInt();
			System.out.print("Enter Product id : ");
			int pid = sc.nextInt();
			
			String qry = "insert into customer values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(1,cid);
			ps.setString(2,cnm);
			ps.setString(3,cadd);
			ps.setInt(4,ccno);
			ps.setInt(5,pid);
			int n = ps.executeUpdate();
			System.out.println(n+" Record Inserted");
			con.close();
		}catch(ClassNotFoundException ce){System.out.println(ce);}
		catch(SQLException se){System.out.println(se);}
	}
}