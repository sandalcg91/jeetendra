import java.util.*;
class ReverseofDigitByMethod
{
	public void ReverseDigit(int n)
	{
		int rev=0, digit=0;
		while(n>0)
		{
			digit = n % 10;
			rev = rev*10 + digit;
			n = n / 10;
		}
		System.out.print("Reverse of Number is : " + rev);
	}
	public static void main(String[] args)
	{
		ReverseofDigitByMethod rdm = new ReverseofDigitByMethod();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		rdm.ReverseDigit(n);
	}
}