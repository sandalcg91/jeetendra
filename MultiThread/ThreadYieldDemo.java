class ThreadYie extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
}
class ThreadYieldDemo
{
	public static void main(String[] args)
	{
		ThreadYie t = new ThreadYie();
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}