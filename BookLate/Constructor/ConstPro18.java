public class ConstPro18
{
	ConstPro18()
	{
		System.out.println(1);
	}
	int i;
	ConstPro18 cp;
	
	public static void main(String[] args)
	{
		System.out.println(cp.i);     //  non-static variable cp cannot be referenced from a static context
	}
}