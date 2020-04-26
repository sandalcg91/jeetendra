import java.util.Scanner;
public class MergeSort
{

	public void merge(int[] arr, int l, int m, int h)
	{
		int l1 = m - l + 1;
		int l2 = h - m;

		int[] L = new int[l1];
		for(int i=0; i<l1; ++i)
			L[i] = arr[l+1];

		int[] R = new int[l2];
		for(int j=0; j<l2; ++j)
			R[j] = arr[m+1+j];

	//  merge the sub arrays

		int i =0, j=0;

	//  index for merge both sub arrys
		int k = l;

		while(i < l1 && j < l2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while(i < l1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		while(j < l2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	} 


	public void sort(int ar[], int l, int h)
	{
		if(l<h)
		{
			int mid = (l+h)/2;

			sort(ar, l, mid);
			sort(ar, mid+1, h);

			merge(ar, l, mid, h);			
		}
	}


	public static void main(String[] args)
	{
		MergeSort msort = new MergeSort();

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
		msort.sort(a, 0, a.length-1);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
}