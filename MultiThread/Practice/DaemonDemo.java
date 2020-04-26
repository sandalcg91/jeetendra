class DaemonThread extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Lazy Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class DaemonDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread().isDaemon());
		DaemonThread dt = new DaemonThread();
	//	dt.setDaemon(true);
		dt.start();
		System.out.println("end of main");
		
	//	System.out.println(dt.isDaemon());
	//	dt.join(10);
	}
}