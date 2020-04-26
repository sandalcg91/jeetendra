class K1 extends Thread
{
	K1()
	{
		start();
	}
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("K1 : " +i);
		}
	}
}
class K
{
	public static void main(String[] args)
	{
		K1 k1 = new K1();
	//	k1.start();
		K1 k2 = new K1();
		for(int i=10; i<20; i++)
		{
			System.out.println("K : " +i);
		}
	}
}