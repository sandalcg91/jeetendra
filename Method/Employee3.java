class Employee3
{
	int empno;
	String name;
	String city = "Indore";
	
	Employee3(int e, String n)
	{
		empno = e;
		name = n;
	}
	void getData()
	{
		System.out.println("Employee number : " +empno);
		System.out.println("Employee name   : " +name);
		System.out.println("Employee City   : " +city);	
	}
	public static void main(String[] args)
	{
		Employee3 e = new Employee3(101,"Chandan");
		e.getData();
	}	
}