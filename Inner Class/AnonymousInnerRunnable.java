class AnonymousInnerRunnable
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			public void run()
			{
				for(int i =0; i<10; i++)
				{
					System.out.println("child thread");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				for(int i =0; i<10; i++)
				{
					System.out.println("child thread");
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("main thread");
		}
	}
}