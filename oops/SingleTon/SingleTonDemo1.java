class Test1
{
	private static Test1 t = null;
	
	private Test1()
	{
		System.out.println("Private Test1 Class");
	}
	public static Test1 getTest()
	{
		if(t == null)
		{
			t = new Test1();
		}
		return t;
	}
}
class SingleTonDemo1
{
	public static void main(String[] args)
	{
		Test1 t1 = Test1.getTest();
		Test1 t2 = Test1.getTest();
		Test1 t3 = Test1.getTest();
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		System.out.println(t2==t3); 
	}
}