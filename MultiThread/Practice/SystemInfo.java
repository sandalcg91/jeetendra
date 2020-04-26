class SystemInfo
{
	public static void main(String[] args)
	{
		Thread d = new Thread();
		d.setDaemon(true);
		d.start();
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread t1 : t)
		{
			System.out.println(t1.getName() + "-------------"+t1.isDaemon()); 
		}
	}
}