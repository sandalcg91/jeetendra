import java.sql.*;
import javax.sql.*; // for pooledConnection(I)
import oracle.jdbc.pool.*; // for oracle connection pool datasource (c)
public class OracleConnectionPool
{
	public static void main(String[] args) throws Exception
	{
		// Connection pool for oracle
		OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
		
		// give details for jdbc connection object
		ds.setDriverType("thin");
		ds.setServerName("localhost");
		ds.setPortNumber(1521);
		ds.setServiceName("orca");
		ds.setUser("scott");
		ds.setPassword("tiger");
		
		// get & access to jdbc connection pool for oracle
		Connection con = ds.getConnection();
		
		// writejdbc based persistance logic
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from dept");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		// close jdbc objects
		rs.close();
		st.close();
		con.close();
	}
}