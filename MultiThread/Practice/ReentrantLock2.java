class DisplayRL
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
class MyThreadLock extends Thread
{
	DisplayRL d;
	String name;
	
	MyThreadLock(DisplayRL d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class ReentrantLock2
{
	public static void main(String[] args)
	{
		DisplayRL d = new DisplayRL();
		DisplayRL d1 = new DisplayRL();
		
		MyThreadLock t1 = new MyThreadLock(d, "Chandan");
		MyThreadLock t2 = new MyThreadLock(d, "sandal");
	//	MyThreadLock t3 = new MyThreadLock(d1, "payal");
	
		t1.start();
		t2.start();
	//	t3.start();
	}
}