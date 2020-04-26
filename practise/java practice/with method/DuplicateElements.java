public class DuplicateElements
{
	public static void duplicateNumber(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j= i+1; j<a.length; j++)
			{
				if(a[i] == a[j] && (i!=j))
				{
					System.out.println("Duplicate Number is " +a[j]);
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		DuplicateElements.duplicateNumber(new int[] {12, 34, 22, 32, 12, 33, 32, 44, 6, 8, 4, 8, 4, 34});
	}
}