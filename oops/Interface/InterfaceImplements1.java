interface Interface2
{
	int a = 20;   //   by default public, final, static
	
	void m();  // by default public and abstract
	void m1();
}
interface Interface3
{
	void m2();  // by default public and abstract
}
class InterfaceImplements1 implements Interface2, Interface3
{
	public void m()    // implemented abstract method
	{
		System.out.println("Implemented method m()");
	}
	public void m1()    // implemented abstract method
	{
		System.out.println("Implemented method m1()");
	}
	public void m2()    // implemented abstract method
	{
		System.out.println("Implemented method m2()");
	}
	void m3()
	{
		System.out.println("Class method m3()");
	}
	public static void main(String[] args)
	{
		InterfaceImplements1 i1 = new InterfaceImplements1();
		i1.m();
		i1.m1();
		i1.m2();
		i1.m3();
		System.out.println(i1.a);
	}
}
/*
output :
	Implemented method m()
	Implemented method m1()
	Implemented method m2()
	Class method m3()
	20
*/