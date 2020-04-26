import java.util.*;
class ReserveNumber
{
	public static void main(String[] args)
	{
		int n, rev=0, digit=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n = sc.nextInt();
		while(n>0)
		{
			digit = n % 10;
			rev = rev*10 + digit;
			n = n / 10;
		}
		System.out.print("Reverse of Number is : " + rev);
	}
}