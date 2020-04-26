class ConstPro1
{
	int i;
	ConstPro1()
	{
		System.out.println("Constructor 1");
	}
	ConstPro1(int i)
	{
		System.out.println("Constructor 2 ConstPro1(int)");
	}
	ConstPro1(int i,int j)
	{
		System.out.println("Constructor 3 ConstPro1(int int)");
	}
	ConstPro1(int i, String s)
	{
		System.out.println("Constructor 4 ConstPro1(int String)");
	}
	public static void main(String[] args)
	{
		ConstPro1 cp1 = new ConstPro1(12);
		ConstPro1 cp2 = new ConstPro1(12, 12);
		ConstPro1 cp3 = new ConstPro1(12, "Chandan");
		ConstPro1 cp4 = new ConstPro1();
	}
}