interface it1
{
	void m();
}
interface it2 extends it1
{
	void m1();
}
class A implements it2
{
	public void m()
	{
		System.out.println("abstract method m() of implemented Interface 1 in class A");
	}
	public void m1()
	{
		System.out.println("abstract method m1() of implemented Interface 2 in class A");
	}
}
class B implements it1, it2
{
	// public void m()
	// {
		// System.out.println("abstract method m() of implemented Interface 1 in class B");
	// }
	// public void m1()
	// {
		// System.out.println("abstract method m1() of implemented Interface 1 in class B");
	// }
	void m2()
	{
		System.out.println("Class method");
	}
}
class C
{
	public static void main(String[] args)
	{
		it1 i;   //  reference of interface 1
		
		i = new B();    // reference variable can hold its implemented class objects
	//	i.m();
	//	i.m1();
		
		it2 j = new B();
	//	j.m();
	//	j.m1();
	}
}
/*
output :
	abstract method m() of implemented Interface 1 in class B
	abstract method m() of implemented Interface 1 in class B
	abstract method m1() of implemented Interface 1 in class B
*/