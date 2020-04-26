
class ParentClass1
{
	void m1()
	{
		System.out.println("Parent class method m1()");
	}
}
class ChildClass1 extends ParentClass1
{
	void m2()
	{
		m1();
		System.out.println("Child class method m2()");
	}
	void m3()
	{
		m1();
		System.out.println("Child class method m3()");
		m2();
	}
	
	public static void main(String[] args)
	{
		ChildClass1 cc = new ChildClass1();
		cc.m3();
	}
}