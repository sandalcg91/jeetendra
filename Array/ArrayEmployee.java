class Employee
{
	int empno;
	String name;
	
	Employee(int en, String nm)
	{
		empno = en;
		name = nm;
	}
	
	void show()
	{
		System.out.println("Employee number : " +empno);
		System.out.println("Employee name   : " +name);
	}
}
class ArrayEmployee
{
	// Array of Objects
	static void show1(Employee[] x)
	{
		//for(int i=0; i<x.length; i++)
			//x[i].show();
		for(Employee ee : x)
			ee.show();
	}
	
	// Return Array of Objects
	
	static Employee[] returnArrayOfObjects()
	{
		Employee[] e = new Employee[5];
		e[0] = new Employee(11, "Chandan");
		e[1] = new Employee(12, "Manish");
		e[2] = new Employee(13, "Arpit");
		e[3] = new Employee(14, "Nitin");
		e[4] = new Employee(15, "Payal");
		return e;
	}
	
	public static void main(String[] args)
	{
		Employee[] e = new Employee[5];
		e[0] = new Employee(11, "Chandan");
		e[1] = new Employee(12, "Manish");
		e[2] = new Employee(13, "Arpit");
		e[3] = new Employee(14, "Nitin");
		e[4] = new Employee(15, "Payal");
		//e[5] = new Employee4();      //   Java is a Strongly Typed language.
		/*for(int i=0; i<e.length; i++)
		{
			e[i].show();
			System.out.println();
		}*/
		show1(e);
		
		System.out.println("---------------------------------------");
		Employee[] n = returnArrayOfObjects();
		show1(n);
		
		System.out.println("---------------------------------------");
		for(Employee z : returnArrayOfObjects())
		z.show();
	}
}