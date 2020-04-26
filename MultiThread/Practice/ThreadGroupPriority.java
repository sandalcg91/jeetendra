class ThreadGroupPriority
{
	public static void main(String[] args)
	{
		
		ThreadGroup tg1 = new ThreadGroup("Thread Group");
		
		Thread t1 = new Thread(tg1, "Thread 1");
		Thread t2 = new Thread(tg1, "Thread 2");
		
		t1.setPriority(8);
		t2.setPriority(2);
		tg1.setMaxPriority(7);
	//	tg1.setMaxPriority(3);
		
		Thread t3 = new Thread(tg1, "Thread 3");
	//	t3.setPriority(2);
	//	t3.setPriority(5);
		
		System.out.println(tg1.getMaxPriority());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
	}
}