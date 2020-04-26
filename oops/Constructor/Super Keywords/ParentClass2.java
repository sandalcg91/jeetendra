class ParentClass2
{
	void m1()
	{
		System.out.println("Parent class method m1()");
	}
}
class ChildClass2 extends ParentClass2
{
	void m1()
	{
		System.out.println("Child class method m1()");
	}
	void m2()
	{
		this.m1();
		System.out.println("Child class method m2()");
		super.m1();
	}
	
	public static void main(String[] args)
	{
		ChildClass2 cc2 = new ChildClass2();
		cc2.m2();
	}
}