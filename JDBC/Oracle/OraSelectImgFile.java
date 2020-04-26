import java.sql.*;
import java.util.*;
import java.io.*;
public class OraSelectImgFile{
	public static void main(String[] args) throws IOException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Image ID : ");
		int imgid = sc.nextInt();
		System.out.print("Enter Image name as a new name you have to save : ");
		String imgnm = sc.next();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","practice","sandal");
			String qry = "select picture from image where imgid = ?";
			ps = con.prepareStatement(qry,1005,1008);
			ps.setInt(1, imgid);
			rs = ps.executeQuery();
			if(rs.next()){
				InputStream in = rs.getBinaryStream("picture");
				FileOutputStream fos = new FileOutputStream(imgnm);
				int byteRead = 0;
				byte[] b = new byte[4096];
				while((byteRead = in.read(b))!=-1){
					fos.write(b,0,byteRead);
				}
				System.out.println("image is stored with new name : "+imgnm);
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