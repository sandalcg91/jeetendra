
// Class Inside the Interface

interface Itfc3
{
	class InnerClass
	{
		void m1()
		{
			System.out.println("Inner Class Method m1()");
		}
	}
}
class ClassInInterface
{
	public static void main(String[] args)
	{
		Itfc3.InnerClass ic = new Itfc3.InnerClass();    //  Call Class inside the Interface with referece of interface
		ic.m1();
	}
}