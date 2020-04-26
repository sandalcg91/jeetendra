class ThreadA
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadB tb = new ThreadB();
		tb.start();
		
		synchronized(tb)
		{
/*1*/		System.out.println("main thread trying to call wait()");
			tb.wait();
/*4*/		System.out.println("main thread got notification");
/*5*/		System.out.println(tb.total);
		}
	}
}
class ThreadB extends Thread
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
/*2*/		System.out.println("child thread start notification");
			for(int i=0; i<=100; i++)
			{
				total = total + i;
			}
/*3*/		System.out.println("Child thread trying to given notification");
			this.notify();
		}
	}
	
}