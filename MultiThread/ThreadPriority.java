class ThreadPriority implements Runnable
{
	public void run()
	{
		System.out.println("child thread");
	}
}
class PriorityImplements
{
	public static void main(String[] args)
	{
		ThreadPriority tp = new ThreadPriority();
		Thread t = new Thread(tp);
		Thread t1 = new Thread(tp);
		System.out.println(t.getPriority()); // 5
		t1.setPriority(8);
	//  System.out.println(t.getPriority()); // 8
	//	t.run();
	    for(int i = 0; i<=10; i++)
		{
			System.out.println("main method " + Thread.currentThread().getName());
		}
		t.start();
		t1.start();
	}
}