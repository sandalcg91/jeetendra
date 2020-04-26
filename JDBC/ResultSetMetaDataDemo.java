import java.sql.*;
import java.io.*;
public class ResultSetMetaDataDemo{
		public static void main(String[] args){
			Connection con = null;
	        Statement st = null;
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customer");
			ResultSetMetaData md = rs.getMetaData();
			
			int columnCount = md.getColumnCount();
			for(int i=1; i<=columnCount; i++)
			{
				System.out.print(md.getColumnLabel(i)+ "\t\t");
			}
			System.out.println("\n");
			System.out.println("-------------------------------------------------------------------------------------");
			for(int i=1; i<=columnCount; i++)
			{
				System.out.print(md.getColumnTypeName(i)+ "\t\t");
			}
			System.out.println("\n");
			System.out.println("-------------------------------------------------------------------------------------");
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException se){
			se.printStackTrace();
			}
		}
	}
}