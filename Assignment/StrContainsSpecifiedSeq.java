import java.util.*;
public class StrContainsSpecifiedSeq
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
		boolean flag = false;
		if(l1>l2)
		{
			for(int i=0; i<st1.length(); i++)
			{
				for(int j=i; j<st2.length(); j++)
				{
					if(st1.charAt(i)==st2.charAt(j))
					{
						count++;
					}
				}
			}
		}
		
		
		
		/*if(count==l1)
		{
			System.out.println(st1+" is equals to "+st2);
		}
		else
		{
			System.out.println(st1+" is not equals to "+st2);
		}*/
	}
}