public class TwoDArray
{
	public static void main(String[] args)
	{
		int[][] z = {{10,20},{30,40,50},{60,70,80,90}};
		for(int i=0; i<z.length; i++)
		{
			for(int j=0; j<z[i].length; j++)
			{
				System.out.print(z[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}