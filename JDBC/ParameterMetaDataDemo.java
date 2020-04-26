import java.sql.*;
import java.io.*;
public class ParameterMetaDataDemo{
	static Connection con = null;
	static PreparedStatement ps = null;
	public static void main(String[] args){
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			ps = con.prepareStatement("insert into student values(?,?,?)");
			
			ParameterMetaData pmd = ps.getParameterMetaData();
			for(int i=1; i<=pmd.getParameterCount(); i++){
				System.out.println("Parameter number : "+i);
				
				System.out.println("Mode is : "+pmd.getParameterMode(i));
				System.out.println("Type is : "+pmd.getParameterType(i));
				System.out.println("Type Name is : "+pmd.getParameterTypeName(i));
				System.out.println("Precision is : "+pmd.getPrecision(i));
				System.out.println("Scale is : "+pmd.getScale(i));
				System.out.println("Nullable? is : "+pmd.isNullable(i));
				System.out.println("Signed? is : "+pmd.isSigned(i));
			}
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}