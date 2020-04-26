import java.util.concurrent.*;
class PrintJob extends Thread
{
	String name;
	
	PrintJob(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		System.out.println(name + " Job started by Thread " + Thread.currentThread().getName());
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
		System.out.println(name + " Job completed by Thread " + Thread.currentThread().getName());
	}
}
class ExecutorDemo
{
	public static void main(String[] args)
	{
		PrintJob[] jobs = { new PrintJob("Chandan"),
							new PrintJob("Sandal "),
							new PrintJob("Vishal "),
							new PrintJob("Gupta  "),
							new PrintJob("Manish "),
							new PrintJob("Payal  ")
						  };
		ExecutorService service = Executors.newFixedThreadPool(8);
		for(PrintJob job : jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}
}