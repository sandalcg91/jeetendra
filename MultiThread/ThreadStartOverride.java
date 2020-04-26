class ThreadStartOverride extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("Super Start Override Method");
	}
	public void run()
	{
		System.out.println("Run method");
	}
}
class StartOverride
{
	public static void main(String[] args)
	{
		ThreadStartOverride t = new ThreadStartOverride();
		t.start();
		//t.run();
		System.out.println("main method");
	}
}