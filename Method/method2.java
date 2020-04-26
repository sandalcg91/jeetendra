
// pass object as parameter of method

class Method2
{
	static void method(Employee3 e1)
	{
		e1.getData();
	}
	public static void main(String[] args)
	{
		Employee3 e = new Employee3(111, "Chandan");
		method(e);
	}
}