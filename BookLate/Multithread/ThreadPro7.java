class H1 implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("H1 : " +i);
		}
	}
}
class H
{
	public static void main(String[] args)
	{
		H1 h1 = new H1();
	//	H1 h2 = new H1();
		Thread t1 = new Thread(h1);
		t1.start();
		
		Thread t2 = new Thread(h1);
		t2.start();
		for(int i=10; i<20; i++)
		{
			System.out.println("H : " +i);
		}
	}
}