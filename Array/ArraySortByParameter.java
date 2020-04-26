
// pass array as parameter
import java.util.*;
class ArraySortByParameter
{
	static int[] Sort(int[] ar)
	{
		int temp=0;
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i] > ar[j])
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		return ar;
	}
	
	public static void main(String[] args)
	{
		ArraySortByParameter asp = new ArraySortByParameter();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Aray : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		System.out.print("enter the array Elements : ");
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		int[] b = asp.Sort(ar);
		System.out.println("Sorted Array : ");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i] + " ");
		}
	}
}