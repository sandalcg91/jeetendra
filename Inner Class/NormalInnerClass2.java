class Outer2
{
	class Inner2
	{
		public void m()
		{
			System.out.println("Inner class Method");
		}
	}
}

//access Inner Class Object from outside of Outer Class
class Outer2Test
{
	public static void main(String[] args)
	{
		System.out.println("Outer Class");

		Outer2 o = new Outer2();
		Outer2.Inner2 i = o.new Inner2();
		i.m();
	}
}