class StaticPro2
{
	int i, j, k;
	
	StaticPro2(int i)
	{
		this.i = i;
		System.out.println("B(int)");
	}
	StaticPro2()
	{
		System.out.println("zero arg constructor");
	}
	void test1()
	{
		System.out.println(i);
	}
	StaticPro2(int j, int k)
	{
		this.j = j;
		this.k = k;
		System.out.println("B(int int)");
	}
	void test()
	{
		StaticPro2 b = new StaticPro2();
		b.test1();
		this.test1();
		System.out.println(i);
		//System.out.println(j);
	}
	
	public static void main(String[] args)
	{
		StaticPro2 s1 = new StaticPro2(10);
		StaticPro2 s4 = new StaticPro2(50);
		StaticPro2 s2 = new StaticPro2(30,23);
		StaticPro2 s3 = new StaticPro2(120,40);
		s1.test();
		/*System.out.println("--------");
		s4.test();
		System.out.println("--------");
		s2.test();*/
	}
}