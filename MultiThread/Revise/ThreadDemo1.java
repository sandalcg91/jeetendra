class MyThread extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start Thread");
	}
	
	public void run()
	{
		System.out.println("Child Thread");
	}
}
class ThreadDemo1
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
		System.out.println("Main Thread");
	}
}