import java.util.*;
class BinarySearchElement
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
	
	int BinarySearch(int[] ar, int e)
	{
		int low=0; 
		int high=ar.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(ar[mid]==e)
			{
				System.out.println("Item Found");
				break;
			}
			else if(ar[mid]<e)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		System.out.println("Element Not Found");
		return 0;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BinarySearchElement bse = new BinarySearchElement();
		
		System.out.print("Enter the Size of Array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		System.out.print("Enter the array Elements : ");
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		
		int[] b = bse.Sort(ar);
		System.out.println("Sorted Array : ");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i] + " ");
		}
		
		
		System.out.print("Enter the Searching Element : ");
		int e = sc.nextInt();
		bse.BinarySearch(b,e);
	}
}