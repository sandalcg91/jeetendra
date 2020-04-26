import java.sql.*;
import java.io.*;
public class DataBaseMetaDataDemo{
	static Connection con = null;
	public static void main(String[] args){
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			DatabaseMetaData md = con.getMetaData();

			System.out.println("Class that implements DatabaseMetaData(I) is : " + md.getClass().getName());
			System.out.println("-----------------------------------------------------------");
			System.out.println("DataBase Name : "+md.getDatabaseProductName());
			System.out.println("-----------------------------------------------------------");
			System.out.println("DataBase Version : "+md.getDatabaseProductVersion());
			System.out.println("-----------------------------------------------------------");
			System.out.println("JDBC Driver Version : "+md.getDriverVersion());
			System.out.println("-----------------------------------------------------------");
			System.out.println("SQL Keywords : "+md.getSQLKeywords());
			System.out.println("-----------------------------------------------------------");
			System.out.println(md.allProceduresAreCallable());
			System.out.println("-----------------------------------------------------------");
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