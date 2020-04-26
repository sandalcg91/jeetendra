class MyThread3 extends Thread
{
	public void start()
	{
		System.out.println("Start");
	}
	public void run()
	{
		System.out.println("run()");
	}
}
class ThreadOverrideStart
{
	public static void main(String[] args)
	{
		MyThread3 mt = new MyThread3();
		mt.start();  // start method call as a normal method
	}
}