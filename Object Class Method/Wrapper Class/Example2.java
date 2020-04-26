public class Example2
{
	public static void main(String[] args)
	{
		Integer X = new Integer(10);
		Integer Y = new Integer(10);
		System.out.println(X==Y); // false for reference Comparition
	
		Integer X1 = 10;
		Integer Y1 = 10;
		System.out.println(X1==Y1); // true
		
		Integer X2 = 100;
		Integer Y2 = 100;
		System.out.println(X2==Y2); // true
		
		Integer X3 = 1000;
		Integer Y3 = 1000;
		System.out.println(X3==Y3); // false // int -128 to 127
	}
}