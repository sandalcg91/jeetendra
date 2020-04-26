class P
{
	P(int a)
	{
		System.out.println(a);
	}
}
class C extends P
{
	C(double d, int a)
	{
		super(10);
		System.out.println(d+ " " +a);
	}
	public static void main(String[] args)
	{
		C c = new C(4.5, 3);
	}
}