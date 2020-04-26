public class ConstPro3
{
	int i;
	ConstPro3()
	{
		i=20;
		System.out.println("ConstPro3");
	}
	public static void main(String[] args)
	{
		System.out.println(new ConstPro3().i); // first call default constructor then i
	}
}