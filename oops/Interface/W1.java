interface inter2
{
	void m();
	void m1();
	
}
class V1 implements inter2
{
	public void m()
	{
		System.out.println("First abstract method");
	}
	public void m1()
	{
		System.out.println("Second abstract method");
	}
}
class X1 implements inter2
{
	public void m()
	{
		System.out.println("last abstract method");
	}
	public void m1()
	{
		System.out.println("Second last abstract method");
	}
}
class W1
{
	public static void main(String[] args)
	{
	//	inter1[] i = new inter1[1];
	//	i[0] = new V();
	//	i[0].m();
		
		
	/*	inter1[] i = new inter1[2];
		i[0] = new V();
		i[1] = new X();
		
		i[0].m();
		i[0].m1();
		i[1].m();
		i[1].m1();
	*/
		inter2 i = new V1();
		i.m();
		i.m1();
		
		i = new X1();
		i.m();
		i.m1();
	}
}