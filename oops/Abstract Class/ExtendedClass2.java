
//  Abstract Class

abstract class AbstractClass2
{
	AbstractClass2()
	{
		System.out.println("Abstract class constructor");
	}
	abstract void m(int a); // Guidelines
	void m(int x, int y) // Set of rules
	{
		System.out.println("Add : " + (x+y));
	}
}
class ExtendedClass2 extends AbstractClass2
{
	void m(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		AbstractClass2[] ac2 = new AbstractClass2[3];         // we can create Array type abstract class reference Variable
		ac2[0] = new ExtendedClass2();
		ac2[0].m(11);
		
		ac2[1] = new ExtendedClass2();
		ac2[1].m(112);
		
		ac2[2] = new ExtendedClass2();
		ac2[2].m(11,12);
	}
}