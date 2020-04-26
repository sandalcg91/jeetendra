import java.sql.*;
import java.util.*;
import java.io.*;
public class OraInsertImg{
	public static void main(String[] args) throws FileNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Image ID : ");
		int imgid = sc.nextInt();
		System.out.print("Enter Image Name : ");
		String imgnm = sc.next();
		System.out.print("Enter Image : ");
		String img = sc.next();
		File f = new File(img);
		FileInputStream fis = new FileInputStream(f);
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","practice","sandal");
			String qry = "insert into image values(?,?,?)";
			ps = con.prepareStatement(qry);
			ps.setInt(1, imgid);
			ps.setString(2, imgnm);
			ps.setBinaryStream(3, fis, (int)f.length());
			int n = ps.executeUpdate();
			System.out.println(n+" Image Details Inserted");
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
				fis.close();
			}catch(SQLException se){
				se.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
}}}}