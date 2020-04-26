class Cons10
{
	int i;
	static int j;
	
	Cons10()
	{
		System.out.println(i);
		System.out.println(j);
	}
	void test()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
class gc
{
	public static void main(String[] args)
	{
		Cons10 c = new Cons10();
		c.test();
		
		Cons10 c1 = new Cons10();
		c1.i = 10;
		c1.j = 30;
		
		c1.test();
	}
}