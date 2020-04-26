public class Example4
{
	public static void main(String[] args)
	{
		Integer X = 127;
		Integer Y = 127;
		System.out.println(X==Y); // true
	
		Integer X1 = 128;
		Integer Y1 = 128;
		System.out.println(X1==Y1); // false

		Float X2 = 10.0f;
		Float Y2 = 10.0f;
		System.out.println(X2==Y2); // false
		
		Boolean b1 = true;
		Boolean b2 = true;
		System.out.println(b1==b2); // true
	}
}