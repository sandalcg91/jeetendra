package p1;
public class A
{
	int a = 10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;
	
	public void m()
	{
		System.out.println("Private Variable : " +c);
		System.out.println("Default Variable : " +a);
	}
}
class B
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("Default Variable : " +a1.a);
		System.out.println("public Variable : " +a1.b);
	//	System.out.println("private Variable : " +a1.c);
		System.out.println("protected Variable : " +a1.d);
	}
}