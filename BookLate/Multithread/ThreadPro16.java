import java.util.Scanner;
class A5 extends Thread
{
	public void run()
	{
		int counter=0;
		while(!isInterrupted())
		{
			counter++;
			System.out.println("Counter : "+counter);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Class----" +e);
				break;
			}
		}
	}
}
class Manager4
{
	public static void main(String[] args)
	{
		A5 a = new A5();
		a.start();
		Scanner sc = new Scanner(System.in);
		String desider;
		do
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("continue?(y/n)");
			desider = sc.next();
		}while("y".equals(desider));
		a.interrupt();
	}
}