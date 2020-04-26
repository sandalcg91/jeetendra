import java.io.*;
class Parent1
{
	void m() throws IOException
	{
		System.out.println("Hello");
	}
}
class CheckedExpChild2 extends Parent1
{
	void m() throws FileNotFoundException //throws IOException
	{
		System.out.println("hii");
	}
	
	public static void main(String[] args) throws IOException
	{
		CheckedExpChild2 cec2 = new CheckedExpChild2();
		cec2.m();
	}
}
class CheckedExpChild3 extends Parent1
{
	void m() //throws FileNotFoundException //throws IOException
	{
		System.out.println("hii");
	}
	
	public static void main(String[] args) //throws IOException
	{
		CheckedExpChild2 cec2 = new CheckedExpChild2();
		cec2.m();
	}
}