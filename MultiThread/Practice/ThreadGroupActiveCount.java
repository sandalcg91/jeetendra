class ThreadGroupDemo extends Thread
{
	ThreadGroupDemo(ThreadGroup g, String name)
	{
		super(g, name);
	}
	public void run()
	{
		System.out.println("Child Thread");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
	}
}
class ThreadGroupActiveCount
{
	public static void main(String[] args) throws Exception
	{
		ThreadGroup tg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(tg, "Child Group");
		
		ThreadGroupDemo t1 = new ThreadGroupDemo(tg, "Thread 1");
		ThreadGroupDemo t2 = new ThreadGroupDemo(tg, "Thread 2");
		
		t1.start();
		t2.start();
		
		ThreadGroupDemo t3 = new ThreadGroupDemo(cg, "Thread 3");
		t3.start();
		
		System.out.println(tg.activeCount()); // 3
		System.out.println(tg.activeGroupCount());  // 1
		tg.list();
		
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
		
		System.out.println(tg.activeCount()); // 0
		System.out.println(tg.activeGroupCount());  // 1
		tg.list();
	}
}