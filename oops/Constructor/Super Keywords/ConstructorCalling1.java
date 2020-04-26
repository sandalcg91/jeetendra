
// Constructor Calling

class A1
{
	A1()
	{
		System.out.println("Parent class Constructor");
	}
	A1(int a)
	{
		System.out.println("Parent class Constructor" +a);
	}
}
class B1 extends A1
{	
	B1()
	{
		//super(10);
		System.out.println("Child class Constructor");
	}
}
class ConstructorCalling1
{
	public static void main(String[] args)
	{
		B1 b = new B1();
	}
}