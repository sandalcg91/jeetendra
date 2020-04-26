class Displ
{
	public void wish(Displ d)
	{
		System.out.print("Hello ");
		System.out.print("Hello ");
		System.out.print("Hello ");
		System.out.println();
		synchronized(d)
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
		System.out.print("Hi ");
		System.out.print("Hi ");
		System.out.print("Hi ");
		System.out.println();
	}
}
class ThreadSB2 extends Thread
{
	Displ d1;
	ThreadSB2(Displ d2)
	{
		d1 = d2;
	}
	public void run()
	{
		d1.wish(d1);
	}
}
class SynchronizedBlock2
{
	public static void main(String[] args)
	{
		Displ d1 = new Displ();
	//	Displ d2 = new Displ();
		
		ThreadSB2 t1 = new ThreadSB2(d1);
		ThreadSB2 t2 = new ThreadSB2(d1);
		
		t1.start();
		t2.start();
	}
}