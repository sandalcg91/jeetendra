import java.util.*;
class SearchMaxMinElement
{
	Scanner sc = new Scanner(System.in);
	int minimum(int[] a)
	{
		int min = a[0];
		
		for(int a1 : a)
		{
			if(min > a1)
				min = a1;
		}
		return min;
	}
	
	int maximum(int[] a)
	{
		int max = a[0];
		for(int a1 : a)
		{
			if(max < a1)
			max=a1;
		}
		return max;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SearchMaxMinElement sme = new SearchMaxMinElement();
		
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		System.out.println("Enter the array element : ");
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		int mn = sme.minimum(ar);
		System.out.println("Minimum element is : " +mn);
		
		int mx = sme.maximum(ar);
		System.out.println("Maximum element is : " +mx);
	}
}