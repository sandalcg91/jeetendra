class ThreadRunnable implements Runnable
{
	public void run()
	{
		for(int i =0; i<=10; i++)
		{
			System.out.println("Child Method");
		}
	}
}
class RunnableImplement
{
	public static void main(String[] args)
	{
		ThreadRunnable tr = new ThreadRunnable();
		Thread t = new Thread(tr);
		t.start();
		for(int i = 0; i<=10; i++)
		{
			System.out.println("main method");
		}
	}
}