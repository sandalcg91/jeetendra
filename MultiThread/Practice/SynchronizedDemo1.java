class Display1
{
	public synchronized void wish(String name)
	{
		for(int i=0; i<10; i++)
		{
			System.out.print("Good Morning : ");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{}
			System.out.println(name);
		}
	}
}
class MyDisplay1 extends Thread
{
	Display1 d;
	String name;
	
	MyDisplay1(Display1 d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class SynchronizedDemo1
{
	public static void main(String[] args)
	{
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		
		MyDisplay1 md = new MyDisplay1(d1, "chandan");
		MyDisplay1 md1 = new MyDisplay1(d2, "sandal");
		
		md.start();
		md1.start();
	}
}