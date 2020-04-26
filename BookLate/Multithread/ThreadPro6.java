class G1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("G1 : " +i);
		}
	}
}
class G
{
	public static void main(String[] args)
	{
		G1 g1 = new G1();
		g1.start();
		
		G1 g2 = new G1();
		g2.start();
	//	g1.start(); // IllegalThreadStateException
		for(int i=10; i<20; i++)
		{
			System.out.println("G : " +i);
		}
	}
}