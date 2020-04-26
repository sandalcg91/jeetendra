
// Interface inside the class

class I1
{
	interface Itfc4
	{
		void m1();
	}
}
class InterfaceinClass implements I1.Itfc4
{
	public void m1()
	{
		System.out.println("Interface method inside class");
	}
	public static void main(String[] args)
	{
		InterfaceinClass i2 = new InterfaceinClass();
		i2.m1();
	}
}