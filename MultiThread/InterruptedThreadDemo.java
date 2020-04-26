class ThreadInterpt extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("Lazy Thread");
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
class InterruptedThreadDemo
{
	public static void main(String[] args)
	{
		ThreadInterpt t = new ThreadInterpt();
		t.start();
		t.interrupt();
		System.out.println("End of main");
	}
}