
// Construction invocation inside method using this() is not possible

class ConsInMethod
{
	ConsInMethod(int a)
	{
		System.out.println(+a);
	}
	void m()
	{
		//this(10);  it is possible only inside the constructor and it must me first statement
	}
	
	public static void main(String[] args)
	{
		ConsInMethod c = new ConsInMethod(11);
		c.m();
	}
}