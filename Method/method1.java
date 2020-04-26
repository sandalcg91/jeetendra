
// call method with the help of return type class

class Method1
{
	Employee3 method()
	{
		return new Employee3(100,"Chandan");
	}
	public static void main(String[] args)
	{
		Method1 m = new Method1();
		Employee3 e = m.method();
		e.getData();
	}
}