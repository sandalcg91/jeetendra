import java.util.*;
class SearchElement
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
		/*System.out.print("Arrays elements are : ");
		for(int i = 0; i<a.length; i++)
	    {
			System.out.print(a[i]+ " ");
		}*/
		
		System.out.println("Enter element that we have to search :");
		int e = sc.nextInt();
		boolean flag = false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==e)
			{
				flag = true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("element Found");
		}
		else
		{
			System.out.println("element not Found");
		}
	}
}
