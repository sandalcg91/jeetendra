class E1 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}
	}
}

class E
{
	public static void main(String[] args)
	{
		E1 e1= new E1();
		e1.start();
		System.out.println("done");
	}
}