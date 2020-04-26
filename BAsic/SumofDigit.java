import java.util.*;
public class SumofDigit
{
	public static void main(String[] args)
	{
		int digit=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Digit : ");
		int n = sc.nextInt();
		while(n>0)
		{
			digit = n % 10;
			sum = sum + digit;
			n = n /10;
		}
		System.out.println("Sum of Digit : "+sum);
	}
}