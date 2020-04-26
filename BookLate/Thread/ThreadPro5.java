class F1 implements Runnable
{
	public void run()
	{
		for(int i=0; i<15; i++)
		{
			System.out.println(i);
		}
	}
}

class F
{
	public static void main(String[] args)
	{
		F1 f = new F1();
		Thread t = new Thread(f);
		t.start();
		for(int i=15; i<30; i++)
		{
			System.out.println(i);
		}
	}
}