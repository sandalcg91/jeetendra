public class ReverseNo
{
	static int tmp;
	static int r = 0, rev = 0;
	public static int reverseNo(int n)
	{
		tmp = n;
		while(n>0)
		{
			r = n%10;
			rev = rev*10+r;
			n = n/10;
		}
		return rev;
	}
	public static void main(String[] args)
	{
		ReverseNo.reverseNo(123456);
		System.out.println(tmp+" Reverse number is : " +rev);
	}
}