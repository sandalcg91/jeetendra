public class PerfectNo
{
	static int tmp = 0, n;
	public static void isPerfectNo(int n)
	{
		for(int i = 1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				tmp = tmp + i;
			}
		}
		if(tmp == n){
			System.out.println(n+" is a Perfect no");
		}else{
			System.out.println(n+" is not a Perfect no");
		}
	}
	public static void main(String[] args)
	{
		PerfectNo.isPerfectNo(24);
	}
}