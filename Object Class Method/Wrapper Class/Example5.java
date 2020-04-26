public class Example5
{
	public static void main(String[] args)
	{
		Long L = 10l;
		long l = 10;
		System.out.println(L);
		System.out.println(l);
		
		
		Integer X = 10;
		Integer Y = X;
		X++;
		System.out.println(X); // 11
		System.out.println(Y); // 10
		System.out.println(X==Y); // false
	}
}