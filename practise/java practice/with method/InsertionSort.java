import java.util.Scanner;
public class InsertionSort
{
	int temp;
	public int[] insertionSort(int[] ar)
	{
		for(int i=1; i<ar.length; i++)
		{
			temp = ar[i];
			int j = i - 1;
			while((temp<ar[j]) && (j>=0))
			{
				ar[j+1] = ar[j];
				j = j - 1;
			}
			ar[j+1] = temp;
		}
		return ar;
	}

	public static void main(String[] args)
	{
		InsertionSort isort = new InsertionSort();

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
		int[] b = isort.insertionSort(a);
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}