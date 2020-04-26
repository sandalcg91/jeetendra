class ThreadJoin extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("child Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{}
		}
	}
}
class JoinThreadDemo
{
	public static void main(String[] args) throws InterruptedException
	{
			ThreadJoin t = new ThreadJoin();
			t.start();
			t.join();  // main thread has to wait for child
		//	t.join(10);  //  main thread will wait for 1/100 sc.
			for(int i=0; i<10; i++)
			{
				System.out.println("main thread");
			}
	}
}