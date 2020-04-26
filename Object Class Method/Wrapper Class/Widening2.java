public class Widening2
{
	public static void m1(int... i)
	{
		System.out.println("Auto-Boxing");
	}
		
	public static void m1(long l)
	{
		System.out.println("Widening");
	}
		
	public static void main(String[] args)
	{
		int x = 10;
		m1(x);
	}
}