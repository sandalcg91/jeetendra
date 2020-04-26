class ThreadPriority1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
		for(int i =0; i<=10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class PriorityImplements1
{
	public static void main(String[] args)
	{
		ThreadPriority1 tp = new ThreadPriority1();
		tp.start();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(tp.getPriority());
		for(int i =0; i<=10; i++)
		{
			System.out.println("main Thread");
		}
	}
}