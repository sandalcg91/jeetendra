import java.sql.*;
public class OraConnection{
	public static void main(String[] args){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orca","practice","sandal");
			String qry = "select * from employee";
			ps = con.prepareStatement(qry);
			rs = ps.executeQuery();
			System.out.println("EID"+"\t"+"Ename"+"\t\t"+"Address"+"\t\t\t"+"Salary"+"\t"+"DeptId"+"\t"+"Age");
			System.out.println("--------------------------------------------------------------------");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6)+"\n");
			}
			System.out.println("--------------------------------------------------------------------");
		}catch(ClassNotFoundException ce){• About Your Self
• In which project you are working, and which client, which technology you are using
• Can you tell about the interface
• Why use interface
• What is a Interface
• Benefits of interface
• What is a abstract class
• What is abstract method
• Why make abstract method
• Difference between Abstract and interface
• You know about OOPS concept
• What is Polymorphism
• What is a Runtime Polymorphism
• Encapsulation in brief
• Difference between Encapsulation and Polymorphism
• What is inheritance explain with example
• Why use exception, explain compile time exception and runtime
• Final, Finally, Finalized
• You know about Threads
• Hashmap internal working
• How to work put method
• Why use arrayList, where use arrayList
• ArrayList vs Vector
• StringBuffer and StringBuilder
• String Class
• How to make immutable
• You know about memory management concept, like Srack, Heap or String pool

• How to integrate Spring with hibernate
• Why use spring, and benefits of spring
• What is Spring MVC
• Explain MVC architecture
• How to load dependency in Spring
• Why use annotations
• @Override, @Qualify, @Autowire
• Difference between @Controller and @RestController
• How to configure Spring
• Why need Dispatcher Servlet
• What are the working of ViewResolver class
• You know about AOP
• Why are you need Bean
• Scope of bean
• Different between Prototype and singleton
• Why use filter or listener

• Difference between Jdbc or hibernate
• Hibernate configuration
• How to communicate Hibernate with database
• How to call procedure in hibernate
• You know about association , type of association
• OnetoMany and OnetoOne example 
• Where use association in hibernate
• Why use cascading
• Why use FetchType
• Difference between Eager and Lazy
• Hibernate advantages
• How to configure to or more database in single application using hibernate configuration

• Which Server use for deployment
• Why use Apache
• Why use Weblogic
• How the process to deploy project
• How many type of servers.
			System.out.println(ce);
		}catch(SQLException se){
			System.out.println(se);
		}finally{
			try{
				con.close();
			}catch(SQLException se){
				System.out.println(se);
}}}}