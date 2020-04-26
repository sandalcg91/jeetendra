public class Widening5
{
	public static void m1(Long L)
	{
		System.out.println("Widening");
	}
	
	public static void main(String[] args)
	{
		Integer I = 10;
		m1(I);
	}
}