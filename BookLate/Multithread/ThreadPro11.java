class L1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("L1 : " +i);
		}
	}
}
class L
{
	public static void main(String[] args)
	{
		L1 l1 = new L1();
		l1.run();
		l1.start();
		for(int i=10; i<20; i++)
		{
			System.out.println("L : " +i);
		}
	}
}