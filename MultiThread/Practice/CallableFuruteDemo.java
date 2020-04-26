import java.util.concurrent.*;
class MyCallable implements Callable
{
	int num;
	MyCallable(int num)
	{
		this.num = num;
	}
	public Object call() throws Exception
	{
		System.out.println(Thread.currentThread().getName()+" is resposible to find sum of first " +num+ " numbers");
		int sum = 0;
		for(int i=1; i<=num; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
}
class CallableFuruteDemo
{
	public static void main(String[] args) throws Exception
	{
		MyCallable[] calls = { new MyCallable(10),
							   new MyCallable(20),
							   new MyCallable(30),
							   new MyCallable(40),
							   new MyCallable(50),
							   new MyCallable(60)
							};
		ExecutorService service = Executors.newFixedThreadPool(6);
		for(MyCallable call : calls)
		{
			Future f = service.submit(call);
			System.out.println(f.get());
		}
	}
}