class ThreadRunnable1 implements Runnable
{
	public void run()
	{
		for(int i =0; i<=10; i++)
		{
			System.out.println("Child Method");
		}
	}
}
class RunnableImplement1
{
	public static void main(String[] args)
	{
		ThreadRunnable1 tr = new ThreadRunnable1();
		Thread t1 = new Thread();
		Thread t2 = new Thread(tr);
		//tr.start();
		t1.start();
		t2.start();
		//t1.run();
		for(int i = 0; i<=10; i++)
		{
			System.out.println("main method");
		}
	}
}