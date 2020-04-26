class MyThread4 extends Thread
{
	public void run()
	{
	//	super.start();  // restart of start method not possible
		System.out.println("run()");
	}
	
	public void start()
	{
		super.start();
		System.out.println("Start");
	}
}
class ThreadOverrideStart1
{
	public static void main(String[] args)
	{
		MyThread4 mt = new MyThread4();
		mt.start();
	//	mt.start(); //  restart or start method not possible
		System.out.println("Main method");
	}
}