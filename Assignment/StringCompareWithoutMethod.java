import java.util.*;
public class StringCompareWithoutMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String st1 = sc.next();
		System.out.println("Enter second String");
		String st2 = sc.next();
		
		int l1 = st1.length();
		int l2 = st2.length();
		int count = 0;
		
		char[] c = new char[l1];
		char[] d = new char[l2];
		
		for(int i=0;i<l1;i++)
		{
			if(st1.charAt(i)>96 && st1.charAt(i)<123)
			{
				c[i] = st1.charAt(i);
			}
			else
			{
				c[i] = st1.charAt(i);
				c[i]+=32;
			}
		}
		for(int i=0;i<l2;i++)
		{
			if(st2.charAt(i)>96 && st2.charAt(i)<123)
			{
				d[i] = st2.charAt(i);
			}
			else
			{
				d[i] = st2.charAt(i);
				d[i]+=32;
			}
		}
		
		if(l1==l2)
		{
			for(int i=0; i<c.length; i++)
			{
				for(int j=i; j<=i; j++)
				{
					if(c[i]==d[j])
					{
						count++;
					}
				}
			}
		}
		if(count==l1)
		{
			System.out.println(st1+" is equals to "+st2);
		}
		else
		{
			System.out.println(st1+" is not equals to "+st2);
		}
	}
}