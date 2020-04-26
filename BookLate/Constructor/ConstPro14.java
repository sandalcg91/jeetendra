class L1
{
	L1()
	{
		this(12);
		System.out.println(1);
	}
	L1(int i)
	{
		System.out.println(2);
	}
}
class L
{
	public static void main(String[] args)
	{
		L1 l = new L1();
		System.out.println("---------------");
		L1 l1 = new L1(12);
	}
}