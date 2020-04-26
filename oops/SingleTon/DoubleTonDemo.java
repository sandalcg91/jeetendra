class Test2
{
	private static Test2 t1;
	private static Test2 t2;
	
	private Test2()
	{
		System.out.println("Private Test2 Class");
	}
	public static Test2 getTest()
	{
		if(t1 == null)
		{
			t1 = new Test2();
			return t1;
		}
		else if(t2 == null)
		{
			t2 = new Test2();
			return t2;
		}
		else
		{
			if(16<17)
				return t1;
			else
				return t2;
		}
	}
}
class DoubleTonDemo
{
	public static void main(String[] args)
	{
		Test2 t11 = Test2.getTest();
		Test2 t12 = Test2.getTest();
		Test2 t13 = Test2.getTest();
		
		System.out.println(t11==t12);
		System.out.println(t11==t13);
		System.out.println(t12==t13); 
	}
}