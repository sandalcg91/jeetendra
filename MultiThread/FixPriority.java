class FixPriority implements Runnable
{
	public void run()
	{
		System.out.println("run()");
	}
}
class FixPriorityImplement
{
	public static void main(String[] args)
	{
		FixPriority fr = new FixPriority();
		Thread t = new Thread(fr);
		t.start();
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}
}