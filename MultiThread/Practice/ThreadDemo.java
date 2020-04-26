class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<20; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
	//	t.start();  //  with out start() you can't create new Thread
		t.start();
	//	t.run();  // run method call as a normal method
		for(int i =0; i<20; i++)
		{
			System.out.println("Main Thread");
		}
	}
}