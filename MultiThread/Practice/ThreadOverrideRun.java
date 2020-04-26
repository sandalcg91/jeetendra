class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("run()");
	}
	public void run(int i)
	{
		System.out.println("run(int)");
	}
}
class ThreadOverrideRun
{
	public static void main(String[] args)
	{
		MyThread2 mt = new MyThread2();
		mt.start();
	}
}