class N
{
	N()
	{
		System.out.println(1);
	}
	N(int i)
	{
		this();
		System.out.println(2);
	}
	N(int i, int j)
	{
		this(i);
		System.out.println(3);
	}

	public static void main(String[] args)
	{
		N n = new N();
		System.out.println("---------------");
		N n1 = new N(12, 13);
		System.out.println("---------------");
	}
}