
//  Abstract Class

abstract class AbstractClass
{
	AbstractClass()
	{
		System.out.println("Abstract class constructor");
	}
	abstract void m(int a);
	
	void m(int x, int y)
	{
		System.out.println("Add : " + (x+y));
	}
}
class ExtendedClass extends AbstractClass
{
	void m(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		ExtendedClass ec = new ExtendedClass();
		ec.m(12);
		ec.m(12,13);
	}
}