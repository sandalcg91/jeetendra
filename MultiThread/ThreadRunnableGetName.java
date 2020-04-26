class ThreadRunnableGetName implements Runnable
{
	public void run()
	{
		for(int i =0; i<=10; i++)
		{
			System.out.println("Child Method " + Thread.currentThread().getName());
		}
	}
}
class RunnableImplementGetName
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		ThreadRunnableGetName tr = new ThreadRunnableGetName();
		Thread t1 = new Thread("abc");
		System.out.println(t1.getName());
		Thread t2 = new Thread(tr);
		//t1.start();
		t2.start();
		//t1.run();
		Thread.currentThread().setName("Chandan");
		for(int i = 0; i<=10; i++)
		{
			System.out.println("main method " + Thread.currentThread().getName());
		}
	}
}