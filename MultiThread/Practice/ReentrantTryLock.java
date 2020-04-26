import java.util.concurrent.locks.*;
class MyThreadLock1 extends Thread
{
	static ReentrantLock rl = new ReentrantLock();
	
	MyThreadLock1(String name)
	{
		super(name);
	}
	public void run()
	{
		if(rl.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+"----------"+ "got lock and performing safe operation");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
			rl.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"---------"+ "unable to get lock and hence performing unsafe operation");
		}
	}
}
class ReentrantTryLock
{
	public static void main(String[] args)
	{
		MyThreadLock1 t1 = new MyThreadLock1("First Thread");
		MyThreadLock1 t2 = new MyThreadLock1("Second Thread");
	
		t1.start();
		t2.start();
	}
}