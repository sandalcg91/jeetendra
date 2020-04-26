public class GetSetName
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Sandal");
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("cg");
		
		System.out.println(Thread.currentThread().getName());
	}
}