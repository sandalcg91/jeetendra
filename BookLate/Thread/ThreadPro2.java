class C extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}
	}
}

class C1
{
	public static void main(String[] args)
	{
		C c = new C();
		c.start();
		for(int i = 10; i<20; i++)
		{
			System.out.println(i);
		}
	}
}