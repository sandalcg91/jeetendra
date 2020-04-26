import java.sql.*;
public class OraCreateTab{
	public static void main(String[] args){
		Connection con = null;
		Statement st = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","practice","sandal");
			String qry = "create table Image(Imgid number(10) primary key, ImageName varchar2(20), picture blob)";
			st = con.createStatement();
			int n = st.executeUpdate(qry);
			System.out.println("Table created successfully");
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