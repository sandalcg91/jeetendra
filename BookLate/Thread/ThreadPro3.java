class D1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("D1 : "+i);
		}
	}
}

class D2 extends D1
{
	public void start()
	{
		System.out.println("Start");
	}
	public void run()
	{
		for(int i = 10; i<20; i++)
		{
			System.out.println("D2 : " +i);
		}
	}
}
class D
{
	public static void main(String[] args)
	{
		D1 d1 = new D1();
	//	d1.run();
		d1.start();
		
	/*	D1 d2 = new D1();
	//	d1.run();
		d2.start(); */
		
		System.out.println("------------");
		D2 d3 = new D2();
	//	d3.start();
		for(int i=20; i<30; i++)
		{
			System.out.println("D  : "+i);
		}
	}
}