class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0; i<10; i++)
		{
			System.out.print("Good Morning : ");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{}
			System.out.println(name);
		}
	}
}
class MyDisplay extends Thread
{
	Display d;
	String name;
	
	MyDisplay(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class SynchronizedDemo
{
	public static void main(String[] args)
	{
		Display d = new Display();
		
		MyDisplay md = new MyDisplay(d, "chandan");
		MyDisplay md1 = new MyDisplay(d, "sandal");
		
		md.start();
		md1.start();
	}
}