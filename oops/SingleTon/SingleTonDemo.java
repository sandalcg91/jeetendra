class Test
{
	private static Test t = new Test();
	
	private Test()
	{
		System.out.println("Private Test Class");
	}
	public static Test getTest()
	{
		return t;
	}
}
class SingleTonDemo
{
	public static void main(String[] args)
	{
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
		Test t3 = Test.getTest();
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t2==t3);
	}
}