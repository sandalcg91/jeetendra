import java.util.*;
public class ArmstrongNumByMethod
{
	
	int armstrongNum(int n)
	{
		int a=0, r=0;
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
		return 0;
	}
	
	public static void main(String[] args)
	{
		ArmstrongNumByMethod anm = new ArmstrongNumByMethod();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		anm.armstrongNum(n);
	}
}