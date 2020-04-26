class MyThread1 extends Thread
{
	
}
class ThreadWithoutOverrideRun
{
	public static void main(String[] args)
	{
		MyThread1 mt = new MyThread1();
		mt.start();
	}
}