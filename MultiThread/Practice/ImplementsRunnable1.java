class MyRunnable1 implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("child thread");
		}
	}
}
class ImplementsRunnable1
{
	public static void main(String[] args)
	{
		MyRunnable1 r = new MyRunnable1();
		Thread t = new Thread();
		Thread t1 = new Thread(r);
	
	//	t.start();  // responsible for thread class run()    -  new thread will be created
	
	//	t.run();  // thread class run() call as a normal method
		
	//	t1.start();  // responsible for MyRunnable1 run()    -  new thread will be created
	
	//	t1.run();  // MyRunnable1 run() call as a normal method
	
	//	r.start();  // CE. Can't find symbol  start() not available
	
	//	r.run(); //  MyRunnable1 run() call as a normal method

		for(int i=0; i<10; i++)
		{
			System.out.println("main thread");
		}
	}
}