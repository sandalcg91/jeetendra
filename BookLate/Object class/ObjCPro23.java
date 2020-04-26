class W1
{
	void test1()
	{
		System.out.println("test1");
	}
}
class W
{
	void teat()
	{
		System.out.println("test");
	}
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class c1 = Class.forName("objectClass.W1"); // ClassNotFoundException
		W1 w = new W1();
		
		Class c2 = w.getClass();

		System.out.println(c1==c2); // true
	}
}