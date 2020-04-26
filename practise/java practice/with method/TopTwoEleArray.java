import java.util.Scanner;
public class TopTwoEleArray
{
	public void fetchTwo(int[] ar)
	{
		int maxOne = 0;
		int maxTwo = 0;

		for(int n : ar)
		{
			if(maxOne < n){
				maxTwo = maxOne;
				maxOne = n;
			}
			else if(maxTwo < n){
				maxTwo = n;
			}
		}
		System.out.println("First Maximum : "+maxOne);
		System.out.println("Second Mamimum : "+maxTwo);
	}

	public static void main(String[] args)
	{
		TopTwoEleArray tta = new TopTwoEleArray();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array : "+"\n");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter the elements of array : ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		tta.fetchTwo(a);
	}
}