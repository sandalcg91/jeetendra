import java.util.Scanner;
public class BubbleSort
{
	int temp = 0;
	public int[] sort(int[] ar)
	{
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]>ar[j])
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
		BubbleSort bs = new BubbleSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the elements of arrays : ");
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("Arrays before sorting : ");
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println(" ");
		int[] b = bs.sort(ar);
		System.out.println("Arrays after sorting : ");
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
	}
}