import java.sql.*;
public class ScrollDemo{
	static Connection con = null;
	static Statement st = null;
	
	public static void main(String[] args){
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root", "sandal");
			String qry = "select * from customer";
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE);
			System.out.println("--------------------------------------------------------------------------------------");
			rs.beforeFirst();
			rs.next();
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
			
			System.out.println("--------------------------------------------------------------------------------------");
			rs.afterLast();
			rs.previous();
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
			
			System.out.println("--------------------------------------------------------------------------------------");
			rs.absolute(2);
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
			
			System.out.println("--------------------------------------------------------------------------------------");
			rs.relative(-1);
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
			
			System.out.println("--------------------------------------------------------------------------------------");
			rs.first();
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
			
			System.out.println("--------------------------------------------------------------------------------------");
			rs.last();
			System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));

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