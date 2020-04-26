class ThreadInfo
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		Thread t = Thread.currentThread();
		System.out.println("Current thread Information is : "+t); //  Thread[main,5,main]
		System.out.println("Current thread Priority is : "+t.getPriority()); // 5
		System.out.println("Current thread Name is : "+t.getName());  // main
	}
}