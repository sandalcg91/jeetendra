class Leg
{
	int i=10;
	static int j=20;
	Leg(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void test()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
class L
{
	public static void main(String[] args)
	{
		Leg l1 = new Leg(10,12);
		l1.test();
	}
}