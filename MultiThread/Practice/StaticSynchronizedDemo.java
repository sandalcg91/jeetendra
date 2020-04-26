class Display2
{
	public static synchronized void wish(String name)
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
class MyDisplay2 extends Thread
{
	Display2 d;
	String name;
	
	MyDisplay2(Display2 d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class StaticSynchronizedDemo
{
	public static void main(String[] args)
	{
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		
		MyDisplay2 md = new MyDisplay2(d1, "chandan");
		MyDisplay2 md1 = new MyDisplay2(d2, "gupta");
		MyDisplay2 md2 = new MyDisplay2(d1, "sandal");
		MyDisplay2 md3 = new MyDisplay2(d2, "manish");
		
		md.start();
		md1.start();
		md2.start();
		md3.start();
	}
}