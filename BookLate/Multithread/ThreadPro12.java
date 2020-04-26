class M
{
	static class A1 extends Thread
	{
		public void run()
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("M : " +i);
			}
		}
	}
	static class B1 implements Runnable
	{
		public void run()
		{
			for(int i=10; i<20;i++)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		A1 a = new A1();
		a.start();
		B1 b = new B1();
		Thread t = new Thread(b);
		t.start();
		for(int i=20; i<30; i++)
		{
			System.out.println(i);
		}
	}
}