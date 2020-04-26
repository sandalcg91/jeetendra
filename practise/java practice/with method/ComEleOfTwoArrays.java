public class ComEleOfTwoArrays
{
	public static void main(String[] args)
	{
		int[] ar1 = {1,2,3,4,5,6,7,8,9};
	
		int[] ar2 = {2,4,6,7,12,34,22};
	
		for (int i=0;i<=ar1.length-1 ;i++ ) {
			for (int j=0; j<=ar2.length-1 ;j++ ) {
				if(ar1[i] == ar2[j])
				{
					System.out.println(ar1[i]);
				}			
			}
		}
	}
}