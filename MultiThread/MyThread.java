class MyThread extends Thread
{
int x;
	public void run()
	{
		for(int i = 0; i<=10; i++)
		{
			System.out.println("Child Thread  : " + Thread.currentThread().getName());
		}
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.run();
		t.start();
		
		for(int i=0; i<=10; i++)
		{
			System.out.println("main Thread : " + Thread.currentThread().getName());
		}
	}
}