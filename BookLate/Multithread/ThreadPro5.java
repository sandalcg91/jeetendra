class F1 implements Runnable
{
	public void run()
	{
		for(int i=0; i<50; i++)
		{
			System.out.println("F1 : " +i);
		}
	}
}
class F
{
	public static void main(String[] args)
	{
		F1 f1 = new F1();
		Thread t1 = new Thread(f1);
		t1.start();
		for(int i=50; i<100; i++)
		{
			System.out.println("F : " +i);
		}
	}
}