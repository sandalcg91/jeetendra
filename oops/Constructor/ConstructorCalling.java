
// Constructor Calling

class A1
{
	A1()
	{
		System.out.println("Parent class Constructor");
	}
}
class B1 extends A1
{	
	B1()
	{
		System.out.println("Child class Constructor");
	}
}
class ConstructorCalling
{
	public static void main(String[] args)
	{
		B1 b = new B1();
	}
}