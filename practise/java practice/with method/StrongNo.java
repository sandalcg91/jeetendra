public class StrongNo
{
	static int n,m, rem, f=0;
	static int fact = 1;
	static int tmp;
	public static int isStrongNo(int n)
	{
		tmp = n;
		while(n>0)
		{
			rem = n%10;
			f = f + StrongNo.factNo(rem);
			n = n/10;
		}
		return f;
	}
	static int factNo(int m)
	{
		for(int i=m;i>0;i--)
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		StrongNo.isStrongNo(145);
		System.out.println(fact);
		System.out.println(f);
	/*	if(tmp==f)
		{
			System.out.println("No is Strong");
		}
		else
		{
			System.out.println("No is not Strong");
		}
*/	}
}