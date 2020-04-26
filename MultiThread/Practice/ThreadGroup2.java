class ThreadGroup2
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getThreadGroup().getName());  // main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());  // System
		
		ThreadGroup g = new ThreadGroup("First Group");
		System.out.println(g.getParent().getName());  // main
		
		ThreadGroup g1 = new ThreadGroup(g, "Second Group");
		System.out.println(g1.getParent().getName());  // First Group
	}
}