class I1 implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("I1 : " +i);
		}
	}
}
class I
{
	public static void main(String[] args)
	{
		I1 i1 = new I1();
		I1 i2 = new I1();
		Thread t1 = new Thread(i1);
		Thread t2 = new Thread(i2);
		t1.start();
		t2.start();
	}
}