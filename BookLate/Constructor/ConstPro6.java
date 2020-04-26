class A1
{
	int i,j;
	String s;
	double d;
	A1(double d1)
	{
		i = 10;
		j = 20;
		s = "Chandan";
		d = 10.23;
		System.out.println("A1(double)");
	}
	A1(int i)
	{
		i = 110;
		j = 220;
		s = "Payal";
		d = 140.33;
		System.out.println("A1(int)");
	}
	A1()
	{
		System.out.println("A1()");
	}
}
class C
{
	public static void main(String[] args)
	{
		A1 a = new A1(123);
		A1 a1 = new A1(123.44);
		A1 a2 = new A1();
		System.out.println(a2.i);
		System.out.println(a1.i);
	}
}