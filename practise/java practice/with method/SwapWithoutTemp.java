import java.util.*;
public class SwapWithoutTemp
{
	public static void swapTwoNumber(int a, int b)
	{
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("a = " +a+ " b = "+b);
	}
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		a = sc.nextInt();
		System.out.println("Enter second number ");
		b = sc.nextInt();
			
		System.out.println("Brfore swaping : ");
		System.out.println("a = " +a+ " b = "+b);
		System.out.println("after swaping : ");
		SwapWithoutTemp.swapTwoNumber(a,b);
	}
}