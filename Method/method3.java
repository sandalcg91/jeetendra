
//   actual/formal

class Method3
{
	static void m(int z)
	{
		System.out.println(z);
		z = 100;
	}
	public static void main(String[] args)
	{
		int a = 10;
		m(a);
		System.out.println(a);
	}
}