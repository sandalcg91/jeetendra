public class ConstPro4
{
	int i;
	ConstPro4()
	{
		System.out.println("ConstPro4()");
	}
	ConstPro4(int i)
	{
		System.out.println("ConstPro4(int)");
	}
	public static void main(String[] args)
	{
		ConstPro4 cp = new ConstPro4();
	}
}