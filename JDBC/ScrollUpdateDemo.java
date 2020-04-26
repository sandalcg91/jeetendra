import java.sql.*;
public class ScrollUpdateDemo{
	static Connection con = null;
	static Statement st = null;

	public static void main(String[] args){
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root", "sandal");
			String qry = "select * from customer";
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = st.executeQuery(qry);
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("Cid"+"\t\t"+"Cname"+"\t\t"+"address"+"\t\t\t"+"MobileNo"+"\t\t"+"proid");
			System.out.println("--------------------------------------------------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getInt(5));
			}
			System.out.println("--------------------------------------------------------------------------------------");
			
		// delete a row
		//	rs.absolute(8);
		//	rs.deleteRow();
		//   System.out.println("Record Deleted Successfully");
		
		// Update a row
		//	rs.absolute(8);
		//	rs.updateString(3, "MR-10 Indore");
		//	rs.updateInt(4,621244694);
		//	rs.updateInt(5,1004);
		//	rs.updateRow();
		//  System.out.println("Record Updated Successfully");
		
		// Insert a row
		//	rs.moveToInsertRow();
		//	rs.updateString(1,"c108");
		//	rs.updateString(2, "vishu");
		//	rs.updateString(3,"Bangali Square");
		//	rs.updateInt(4, 789451665);
		//	rs.updateInt(5, 1001);
		//	rs.insertRow();
		//	System.out.println("Record Inserted Successfully");
		
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