import java.util.*;
public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int a=0, r=0, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n = sc.nextInt();
		int m = n;
		while(n>0)
		{
			r = n % 10;
			a = a + (r*r*r);
			n = n / 10;
		}
		if(m == a)
		{
			System.out.println("Given Number is Armstrong");
		}
		else
		{
			System.out.println("Given Number is Not a Armstrong");
		}
	}
}