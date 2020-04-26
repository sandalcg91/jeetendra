import java.util.Scanner;
public class SearchMaxMinElements
{
	public int minElement(int[] a)
	{
		int min = a[0];
		for(int a1 : a){
			if(min>a1)
				min = a1;
		}
		return min;
	}

	public int maxElement(int[] a)
	{
		int max = a[0];
		for(int a1 : a){
			if(max<a1)
				max = a1;
		}
		return max;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter Arrays elements : ");
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = sc.nextInt();
		}
		SearchMaxMinElements smm = new SearchMaxMinElements();
		System.out.println("Minimum Elements : "+smm.minElement(ar));
		System.out.println("Maximum Elements : "+smm.maxElement(ar));
	}
}