class ThreadJoin1 extends Thread
{
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join(); // 
		}
		catch(InterruptedException ie)
		{}
		for(int i=0; i<10; i++)
		{
			System.out.println("child Thread");
		}
	}
}
class JoinThreadDemo1
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadJoin1.mt = Thread.currentThread();
		ThreadJoin1 t = new ThreadJoin1();
		t.start();
	//	t.join();  //  Dead Lock Occure
		t.join(5000);  // main thread has to wait for child
		for(int i=0; i<10; i++)
		{
			System.out.println("main thread");
		try
		{ 
			Thread.sleep(2000);
		}
		catch(Exception e)
		{ }
		}
	}
}