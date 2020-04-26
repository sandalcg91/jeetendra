class K1
{
	K1()
	{
		System.out.println(1);
	}
	K1(int i)
	{
		this();
		System.out.println(2);
	}
}
class K
{
	public static void main(String[] args)
	{
		K1 k = new K1();
		System.out.println("---------------");
		K1 k1 = new K1(12);
	}
}