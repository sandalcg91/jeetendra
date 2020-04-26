interface inter1
{
	void m();
	void m1();
	
}
class V implements inter1
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
class X implements inter1
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
class W
{
	public static void main(String[] args)
	{
	//	inter1[] i = new inter1[1];
	//	i[0] = new V();
	//	i[0].m();
		
		
		inter1[] i = new inter1[2];
		i[0] = new V();
		i[1] = new X();
		
		i[0].m();
		i[0].m1();
		i[1].m();
		i[1].m1();
		
	}
}