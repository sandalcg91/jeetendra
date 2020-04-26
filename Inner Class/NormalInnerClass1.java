class Outer1
{
	class Inner1
	{
		public void m()
		{
			System.out.println("Inner class Method");
		}
	}

	//access Inner Class Object in instance area(method) of Outer Class

	public void m1()
	{
		System.out.println("Outer class Instance method");
		Inner1 i = new Inner1();
		i.m();
	}

	public static void main(String[] args)
	{
		System.out.println("Outer Class static Area");
		Outer1 o = new Outer1();
		
		o.m1();
	}
}