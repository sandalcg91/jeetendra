class A2 extends Thread
{
	public void run()
	{
		System.out.println("End");
	}
	class B2 extends Thread
	{
		public void run()
		{
			for(int i=0; i<10;i++)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		A2 a = new A2();
		A2.B2 b = a.new B2();
		a.setDaemon(true);
		b.start();
		a.start();
		System.out.println("Done");
	}
}
class Manager2
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread();
		t1.setDaemon(true);
		A2 a = new A2();
		a.start();
		System.out.println("done");
	}
}