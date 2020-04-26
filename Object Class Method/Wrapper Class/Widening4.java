public class Widening4
{
	public static void m1(Long L)
	{
		System.out.println("Long");
	}
		
	public static void main(String[] args)
	{
		long x = (int)10;
		m1(x);
	}
}