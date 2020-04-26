class SuperClass
{
	SuperClass(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("Super Class Constructor");
	}
}
class CallingSuperClassConst extends SuperClass
{
	CallingSuperClassConst(int a)
	{
		super(100,200);
		System.out.println("Child Class Constructor " +a);
		//super(100,200);   // Super must be first Statement
	}
	
	public static void main(String[] args)
	{
		CallingSuperClassConst cs = new CallingSuperClassConst(10);
	}
}