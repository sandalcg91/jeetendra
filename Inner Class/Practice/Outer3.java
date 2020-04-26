
//  Accessing Outer Class all Members(Static & Non Static) from Inner Class

class Outer3
{
	static int x = 19;
	int y = 23;
	
	class Inner3
	{	
		public void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String[] args)
	{
		Outer3 o = new Outer3();
		Outer3.Inner3 i = o.new Inner3();
		i.m1();
	}
	
}