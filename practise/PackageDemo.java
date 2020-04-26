import java.util.Date;   // explicitly class import will be concidered
 import java.sql.*;
class PackageDemo
{
	public static void main(String[] args)
	{
		Date d = new Date();
		System.out.println(d.getClass().getName());	
		System.out.println(d);
	}
}
// Load On Demand -- PrintWriter class invoked at run time

// Explicit Class Import
// Classes present in Current Working Directry
// Implicitly Class Import

// import java.lang
// default pkg (CWD)

// java.util.ArrayList - CT less time         ----- Fully Qualified NAme
// import java.util.ArrayList  - CT more time ----- Short NAme
// But in both case Execution will be same

