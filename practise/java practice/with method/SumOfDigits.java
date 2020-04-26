public class SumOfDigits
{
	static int tmp;
	static int dig = 0, sum = 0;
	public static int sumOfDigits(int n)
	{
		tmp = n;
		while(n>0)
		{
			dig = n%10;
			sum = sum+dig;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		SumOfDigits.sumOfDigits(123456);
		System.out.println(tmp+" Sum of Digits is : " +sum);
	}
}