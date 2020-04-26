import java.sql.*;
import java.util.*;
import java.io.*;
public class OraInsertText{
	public static void main(String[] args) throws FileNotFoundException{
		Connection con = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Text ID : ");
		int tid = sc.nextInt();
		System.out.print("Enter Text Name : ");
		String tnm = sc.next();
		System.out.print("Enter Text File : ");
		String txtfl = sc.next();
		File f = new File(txtfl);
		FileInputStream fis = new FileInputStream(f);
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","practice","sandal");
			String qry = "insert into resume values(?,?,?)";
			ps = con.prepareStatement(qry);
			ps.setInt(1, tid);
			ps.setString(2, tnm);
			ps.setCharacterStream(3, fis, (int)f.length());
			int n = ps.executeUpdate();
			System.out.println(n+" Resume Details Inserted");
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