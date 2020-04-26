class J1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("J1 : " +i);
		//	start();  // IllegalThreadStateException
		}
	}
}
class J
{
	public static void main(String[] args)
	{
		J1 j1 = new J1();
		j1.start();
		
		for(int i=10; i<20; i++)
		{
			System.out.println("J : " +i);
		}
	}
}