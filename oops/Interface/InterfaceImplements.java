
// Interface : Collection of abstract methods(must be public)

interface Interface1
{
	int a = 20;   //   by default public, final, static
	
	void m();  // by default public and abstract
}
class InterfaceImplements implements Interface1
{
	public void m()    // implemented abstract method
	{
		System.out.println("Implemented method");
	}
	void m1()
	{
		System.out.println("Class method");
	}
	public static void main(String[] args)
	{
		InterfaceImplements ii = new InterfaceImplements();
		ii.m();
		ii.m1();
		System.out.println(ii.a);
	}
}
/*
output :
	Implemented method
	Class method
	20
*/