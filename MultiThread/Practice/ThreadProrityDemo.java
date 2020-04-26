class ThreadPro extends Thread
{
	public void run()
	{
		for(int i=0; i<20; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class ThreadProrityDemo
{
	public static void main(String[] args)
	{
		ThreadPro t = new ThreadPro();
		t.setPriority(10);
		t.start();
		
		for(int i=0; i<20; i++)
		{
			System.out.println("Main Thread");
		}
	}
}