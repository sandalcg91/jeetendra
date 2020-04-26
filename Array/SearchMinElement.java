import java.util.*;
class SearchMinElement
{
	Scanner sc = new Scanner(System.in);
	int minimum(int[] a)
	{
		int min = a[0];
		System.out.println("Enter the array element : ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int a1 : a)
		{
			if(min > a1)
			{
				min = a1;
			}
		}
		return min;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SearchMinElement sme = new SearchMinElement();
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		sme.minimum(ar);
	}
}