class Jeg
{
	int i;
	static int j;
	Jeg()
	{
		i=20;
		j=30;
	}
	Jeg(int k, int m)
	{
		i=k;
		j=m;
	}
	void test()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
class J
{
	public static void main(String[] args)
	{
		Jeg j1 = new Jeg();
		Jeg j2 = new Jeg(12,13);
		j1.test();
		j2.test();
	}
}