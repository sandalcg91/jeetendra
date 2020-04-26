
// Interface inside the Interface

interface Itfc1
{
	void m();
	interface Itfc2
	{
		void m1();
	}
}
class ImplClass implements Itfc1
{
	public void m()
	{
		System.out.println("Outer Interface method");
	}
}
class InnerInterface implements Itfc1.Itfc2    // implements inner interface with the reference of outer interface
{
	public void m1()
	{
		System.out.println("Inner Interface method");
	}
}
class InterfaceInInterface
{
	public static void main(String[] args)
	{
		InnerInterface ii = new InnerInterface();
		ii.m1();
		//ii.m();
	}
}