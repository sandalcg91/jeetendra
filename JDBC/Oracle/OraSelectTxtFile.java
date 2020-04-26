import java.sql.*;
import java.util.*;
import java.io.*;
public class OraSelectTxtFile{
	public static void main(String[] args) throws IOException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text ID : ");
		int tid = sc.nextInt();
		System.out.print("Enter text name as a new name you have to save : ");
		String tnm = sc.next();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","practice","sandal");
			String qry = "select textfile from resume where textid = ?";
			ps = con.prepareStatement(qry,1005,1008);
			ps.setInt(1, tid);
			rs = ps.executeQuery();
			if(rs.next()){
				Blob bl = rs.getBlob("textfile");
				InputStream in = bl.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(tnm);
				int bytesRead = -1;
				byte[] b = new byte[4096];
				while((bytesRead = in.read(b))!=-1){
					fos.write(b,0,bytesRead);
				}
				System.out.println("Textfile is stored with new name : "+tnm);
			}
		}catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
			//	fos.close();
			}catch(SQLException se){
				se.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
}}}}