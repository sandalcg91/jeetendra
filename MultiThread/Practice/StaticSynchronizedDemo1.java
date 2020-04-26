class Display3
{
	public static synchronized void wish()
	{
		for(int i=0; i<10; i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{}
		}
	}
	public static synchronized void wish1()
	{
		for(int i=65; i<75; i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{}
		}
	}
	public synchronized void wish2()
	{
		for(int i=97; i<107; i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{}
		}
	}
}
class MyDisplay3 extends Thread
{
	Display3 d;
	
	MyDisplay3(Display3 d)
	{
		this.d = d;
	}
	public void run()
	{
		d.wish();
	}
}
class MyDisplay31 extends Thread
{
	Display3 d;
	
	MyDisplay31(Display3 d)
	{
		this.d = d;
	}
	public void run()
	{
		d.wish1();
	}
}
class MyDisplay311 extends Thread
{
	Display3 d;
	
	MyDisplay311(Display3 d)
	{
		this.d = d;
	}
	public void run()
	{
		d.wish2();
	}
}
class StaticSynchronizedDemo1
{
	public static void main(String[] args)
	{
		Display3 d = new Display3();
		
		MyDisplay3 md = new MyDisplay3(d);
		MyDisplay31 md1 = new MyDisplay31(d);
		MyDisplay311 md2 = new MyDisplay311(d);
		
		md.start();
		md1.start();
		md2.start();
	}
}