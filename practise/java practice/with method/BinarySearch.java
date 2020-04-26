import java.util.Scanner;
public class BinarySearch
{
	public int[] sort(int[] a)
	{
		int temp = 0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public int binarySearch(int[] a, int e)
	{
		int low = 0;
		int high = a.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(a[mid]==e)
			{
				System.out.println("Element found");
				break;
			}
			else if(a[mid]<e)
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
	//	System.out.println("Element not found");

		return 0;
	}


	public static void main(String[] args)
	{
		BinarySearch search = new BinarySearch();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array : "+"\n");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter the elements of array : ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Sorted array  ");
		int[] b = search.sort(a);
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.print("\n");

		System.out.println("Enter the Searching Element : ");
		int e = sc.nextInt();
		search.binarySearch(a,e);
	}
}