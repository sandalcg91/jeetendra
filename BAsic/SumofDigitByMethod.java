import java.util.*;
class SumofDigitByMethod
{
	public void SumofDigit(int n)
	{
		int digit=0, sum=0;
		while(n>0)
		{
			digit = n % 10;
			sum = sum + digit;
			n = n /10;
		}
		System.out.println("Sum of Digit : "+sum);
	}
	public static void main(String[] args)
	{
		SumofDigitByMethod sdm = new SumofDigitByMethod();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Digit : ");
		int n = sc.nextInt();
		sdm.SumofDigit(n);
	}
}