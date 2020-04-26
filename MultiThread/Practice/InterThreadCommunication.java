class SandalThread extends Thread
{
	int total =0;
	
	public void run()
	{
		synchronized(this)
		{
/*2*/		System.out.println("child thread starts calculation");
			for(int i=1; i<=10000; i++)
			{
				total = total + i;
			}
/*3*/		System.out.println("child thread trying to give notofication");
			this.notify();
		} 
	//	this.notify();  // we can call only inside synchronized area
	}
}
class InterThreadCommunication
{
	public static void main(String[] args) throws InterruptedException
	{
		SandalThread sd = new SandalThread();
		sd.start();
	//	sd.join();  // unnaccesary child class have to wait;
	//	sd.wait();  // we can call only inside synchronized area
		Thread.sleep(10000);

		synchronized(sd)
		{
/*1*/		System.out.println("main thread trying to call wait method");
			sd.wait(); // immediatly main thread will entered in waiting state
		//	sd.wait(10000);
/*4*/		System.out.println("main thread got notofication");
/*5*/		System.out.println(sd.total);
		}
	}
}