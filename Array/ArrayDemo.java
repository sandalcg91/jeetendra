import java.util.*;
class ArrayDemo
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
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
}