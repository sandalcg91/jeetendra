public class FactorialNo
{
	static int fact = 1,n;
	public static int factorialNo(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		FactorialNo.factorialNo(6);
		System.out.println("Factorial is " +fact);
	}
}