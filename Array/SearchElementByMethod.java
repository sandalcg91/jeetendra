// Search an Elements by Methods
import java.util.*;
class SearchElementByMethod
{
	Scanner sc = new Scanner(System.in);
	//int[] ar =new int[10];
	int[] setData(int[] ar)
	{
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		return ar;
	}
	
	
	boolean Search(int[] ar, int e)
	{
		boolean flag = false;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==e)
			{
				flag=true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
		return flag;
	}
	
	
	public static void main(String[] args)
	{
		SearchElementByMethod sem = new SearchElementByMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		sem.setData(ar);
		System.out.println("Array Elements are : ");
		for(int i =0; i<ar.length; i++)
		{
			System.out.println(ar[i]+ " ");
		}
		
		System.out.println("Enter the element that you want to search : ");
		int e = sc.nextInt();
		sem.Search(ar,e);
		
	}
}

