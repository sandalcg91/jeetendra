
// Armstrong Number from 0 to 1000

public class ArmstrongByRange
{
	void ArmstrongRange(int from, int to)
	{
		int r=0, a=0;
		for(int i=from; i<=to; i++)
		{
			int m=i, sum=0;
			while(m!=0)
			{
				r = m % 10;
				a = a + (r*r*r);
				m = m / 10;
			}
			if(sum==i)
			{
				System.out.println(i+ " ");
			}
		}
	}
	
	
	
	public static void main(String[] args)
	{
		ArmstrongByRange abr = new ArmstrongByRange();
		abr.ArmstrongRange(0,1000);
	}
}

