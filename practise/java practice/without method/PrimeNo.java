import java.util.*;
public class PrimeNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no : ");
		int n = sc.nextInt();
		int tmp =0;		
		for(int i=2; i<n/2; i++)
		{
			if(n%i==0)
			{
			    tmp = n;	
			}
		}
		if(n!=tmp)
		{
			System.out.println("Given no is a prime");	
		}
		else
		{
			System.out.println("Given no is not a prime");	
		}	
	}
}
