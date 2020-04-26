class A3 extends Thread
{
	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(i);
		}
		System.out.println("child end 1");
	}
}
class A4 extends Thread
{
	public void run()
	{
		for(int i=10; i<20;i++)
		{
			System.out.println(i);
		}
		System.out.println("child end 2");
	}
}
class Manager3
{
	public static void main(String[] args)
	{
		A3 a = new A3();
		a.start();
		A4 a1 = new A4();
		a1.start();
		try
		{
			a1.join();
		//	a.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		for(int i=20; i<30; i++)
		{
			System.out.println(i);
		}
		System.out.println("main end");
	}
}