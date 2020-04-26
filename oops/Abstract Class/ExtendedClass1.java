
//  Abstract Class

abstract class AbstractClass1
{
	AbstractClass1()
	{
		System.out.println("Abstract class constructor");
	}
	abstract void m(int a);
	void m(int x, int y)
	{
		System.out.println("Add : " + (x+y));
	}
}
class ExtendedClass1 extends AbstractClass1
{
	void m(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		AbstractClass1 ac;         // we can create abstract class reference variable
		
		ExtendedClass1 e = new ExtendedClass1();
		
		ac = new ExtendedClass1();
		ac.m(11);
	}
}