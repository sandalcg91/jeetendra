class MyThreadRunOverLoad extends Thread
{
	public void run()
	{
		System.out.println("run()");
	}
	public void run(int i)
	{
		System.out.println("run(int)");
	}
}
class ThreadDemorunOverLoad
{
	public static void main(String[] args)
	{
		MyThreadRunOverLoad t = new MyThreadRunOverLoad();
		MyThreadRunOverLoad t1 = new MyThreadRunOverLoad();
		t.run(11);
		t.start();
		//t1.start();
	//	System.out.println("main Thread : " + Thread.currentThread().getName());
	//	System.out.println(t.getName());
	//	System.out.println(t1.getName());
	}
}