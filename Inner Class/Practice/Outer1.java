
//  Accessing Inner Class Code from Instance Area of Outer Class

class Outer1
{
	class Inner1
	{	
		public void m1(int a, int b)
		{
			System.out.println("Sum of Two Numbers : "+(a+b));
		}
	}
	public void m2()
	{
		Inner1 i = new Inner1();
		i.m1(12,23);
	}	
	public static void main(String[] args)
	{
		Outer1 o = new Outer1();
		o.m2();
	}
}