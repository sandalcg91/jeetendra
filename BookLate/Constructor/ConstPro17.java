public class ConstPro17
{
	int i;
	public static void main(String[] args)
	{
		ConstPro17 cp = null;  // NullPointerException
		System.out.println(cp.i);
	}
}