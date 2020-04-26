public class Widening3
{
	public static void m1(Integer I)
	{
		System.out.println("Auto-Boxing");
	}

	public static void m1(int... i)
	{
		System.out.println("var...Arg");
	}

	public static void main(String[] args)
	{
		int x = 10;
		m1(x);
	}
}