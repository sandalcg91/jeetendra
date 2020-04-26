class E1 extends Thread
{
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.println("E1 : " +i);
		}
	}
}
class E
{
	public static void main(String[] args)
	{
		E1 e1 = new E1();
		e1.start();
		System.out.println("Done");
	}
}