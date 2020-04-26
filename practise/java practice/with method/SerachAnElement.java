public class SearchAnElement
{
	public int[] setData(int[] ar)
	{
		for (int i=0;i<ar.length ;i++ ) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	public boolean searchElement(int[] ar, int e)
	{
		boolean flag = false;
		for (int i=0;i<ar.length ;i++ ) {
			if(ar[i]==e){
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println("Element Found");
		else
			System.out.println("Element not Found");
	}

	public static void main(String[] args){
		
		SearchAnElement se = new SearchAnElement();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array elements : ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		se.setData();
		System.out.println("Arrays elements are : ");
		for (int i=0;i<ar.length ;i++ ) {
			System.out.print(ar[i] + " ");
		}
		System.out.print("Enter element that you have to serach : ");
		int e = sc.nextInt();
		se.searchElement(ar, e);
	}
}