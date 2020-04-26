
// Instance Blocks

class A
{
	int a=10; 
	{
		System.out.println(a);       // Instance Block
	}
	int m()
	{
		return 20;
	}
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.m());
	}
}