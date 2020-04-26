class Manager1
{
	public static void main(String[] args)
	{
		class A3 extends Thread
		{}
		A3 a = new A3();
		System.out.println(a.getPriority());
		Thread t1 = Thread.currentThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		A3 a1 = new A3();
		System.out.println(a1.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(a1.getPriority());
	}
}