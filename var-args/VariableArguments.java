
// variable arguments methods (var-args)

public class VariableArguments
{
	void m(byte b)
	{
		System.out.println("Bytes : "+b);
	}
	/*void m(short s)
	{
		System.out.println("Shorts : "+s);
	}*/
	void m(int x)
	{
		System.out.println("integer : "+x);
	}
	void m(int x, int y)
	{
		System.out.println("Integers are " +x + " " +y);
	}
	void m(int... p)
	{
		System.out.print(p);
	}
	
	public static void main(String[] args)
	{
		VariableArguments va = new VariableArguments();
		byte b = 123;
		va.m(122);
		va.m(b);
		va.m(12345);
		va.m(12,12);
	}
}