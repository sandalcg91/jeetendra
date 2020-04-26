class Beg
{
	int i = 90;
	Beg(int i)
	{
		System.out.println("Beg(int)");
	}
	Beg()
	{
		System.out.println("Beg()");
	}
}
class B
{
	public static void main(String[] args)
	{
		Beg b1 = new Beg();
		System.out.println("-----------");
		Beg b = new Beg(10);
	}
}