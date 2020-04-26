class Disp1
{
	public void wish()
	{
		System.out.print("Hello 1 ");
		System.out.print("Hello 2 ");
		System.out.print("Hello 3 ");
		System.out.println();
		synchronized(Disp.class) // SynchronizedBlock for class level lock
		{
			for(int i=0; i<10; i++)
			{
				System.out.print(i);
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{}
			}
		}
		System.out.println();
		System.out.print("Hi 1");
		System.out.print("Hi 2");
		System.out.print("Hi 3");
		System.out.println();
	}
}
class ThreadSB1 extends Thread
{
	Disp1 d;
	ThreadSB1(Disp1 d)
	{
		this.d = d;
	}
	public void run()
	{
		d.wish();
	}
}
class SynchronizedBlock1
{
	public static void main(String[] args)
	{
		Disp1 d1 = new Disp1();
		Disp1 d2 = new Disp1();
		
		ThreadSB1 t1 = new ThreadSB1(d1);
		ThreadSB1 t2 = new ThreadSB1(d2);
		
		t1.start();
		t2.start();
	}
}