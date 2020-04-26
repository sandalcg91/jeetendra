class C extends Thread
{
	public void run()
	{
		for(int i=0; i<1000; i++)
		{
			System.out.println(i);
		}
	}
}
class B
{
	public static void main(String[] args)
	{
		C c = new C();
		c.start();
		for(int i=1000; i<2000; i++)
		{
			System.out.println(i);
		}
	}
}