
//  Accessing Inner Class Code from OutSide of Outer Class

class Outer2
{
	class Inner2
	{	
		public void m1(int a, int b)
		{
			System.out.println("Sum of Two Numbers : "+(a+b));
		}
	}
}
class TestOuter2
{
	public static void main(String[] args)
	{
		Outer2 o = new Outer2();
		Outer2.Inner2 i = o.new Inner2();
		i.m1(10,21);
	}
}