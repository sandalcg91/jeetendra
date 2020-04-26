public class WCPro4
{
	public static void main(String[] args)
	{
		Boolean b1 = new Boolean("true");
		Boolean b2 = new Boolean(true);
		Boolean b3 = new Boolean("abc");
		Boolean b4 = new Boolean("TRUE");
		Boolean b5 = new Boolean("1234");
		Boolean b6 = new Boolean("false");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
	}
}