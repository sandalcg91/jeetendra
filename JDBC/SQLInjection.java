import java.util.*;
import java.sql.*;
public class SQLInjection{
	public static void main(String[] args){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter User Name : ");
		String unm = sc.next();
		System.out.print("Enter password : ");
		String pass = sc.next();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","sandal");
	    /*	if(con==null)
				System.out.println("Not connected");
			else
				System.out.println("connected");
	    */
			st = con.createStatement();
			String q = "select count(*) from users where username ='"+unm+"' and password ='"+pass+"'";
			rs = st.executeQuery(q);
			int cnt = 0;
			if(rs.next()){
				cnt  = rs.getInt(1);
			}
			if(cnt==0){
				System.out.println("Invalid Credential");
			}else{
				System.out.println("Valid Credential");
			}
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException se){
				se.printStackTrace();
}}}}