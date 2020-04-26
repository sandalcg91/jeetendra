import java.sql.*;
public class BatchProcessDemo{
	public static void main(String[] args){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Load or Registered Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","sandal");
			System.out.println("Connection Established");
			con.setAutoCommit(false);
			st = con.createStatement();
			System.out.println("Statement Prepared");

			st.addBatch("insert into student values(107,'sandal',60)");
			st.addBatch("update student set sname='pagal', marks=80 where sid=107");
			st.addBatch("delete from student where sid=108");

			int res[] = st.executeBatch();
			int sum = 0;
			for(int i=0; i<res.length; ++i){
				sum = sum + res[i];
			}
			System.out.println("no of records that are effected is "+sum);
			boolean flag = true;
			for(int i=0; i<res.length; ++i){
				if(res[i]==0){
					flag = false;
					break;
				}
			}
			if(flag)
				con.commit();
			else
				con.rollback();
		}catch(ClassNotFoundException ce){
			System.out.println(ce);
		}catch(SQLException se){
			System.out.println(se);
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				System.out.println(e);
}}}}