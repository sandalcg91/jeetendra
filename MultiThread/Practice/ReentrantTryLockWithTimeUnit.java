import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class MyThreadLock2 extends Thread
{
	static ReentrantLock rl = new ReentrantLock();
	
	MyThreadLock2(String name)
	{
		super(name);
	}
	public void run()
	{
		do
		{
			try
			{
				if(rl.tryLock(5000, TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+"----------"+ "got lock and performing safe operation");
					try
					{
						Thread.sleep(30000);
					}
					catch(InterruptedException e)
					{}
					rl.unlock();
					System.out.println(Thread.currentThread().getName()+"----------"+ "Releases Lock");
					break;
				}
				else
				{
					System.out.println(Thread.currentThread().getName() +"---------"+ "unable to get lock and hence performing unsafe operation");
				}
			}
			catch(Exception e)
			{}
	    }while(true);
	}
}
class ReentrantTryLockWithTimeUnit
{
	public static void main(String[] args)
	{
		MyThreadLock2 t1 = new MyThreadLock2("First Thread");
		MyThreadLock2 t2 = new MyThreadLock2("Second Thread");
	
		t2.start();
		t1.start();
	}
}