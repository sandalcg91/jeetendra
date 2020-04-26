import java.util.*;
class ArrayByMethod
{
	Scanner sc = new Scanner(System.in);
	void arrayCreation(int[] a)
	{
		
		System.out.println("Enter the array element : ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Arrays elements are : ");
		for(int i = 0; i<a.length; i++)
	    {
			System.out.print(a[i]+ " ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayByMethod abm = new ArrayByMethod();
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		abm.arrayCreation(ar);
	}
}