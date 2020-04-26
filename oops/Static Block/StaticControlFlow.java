
// Static control flow

/*
	1 Identification of satic members from top to bottom.
	2 Execution of static variable assignments and static blocks from top to bottom.
	3 Execution of main method.
*/

class StaticControlFlow
{
	static int x = 20;
	static
	{
		method();
		System.out.println("First static Block");
	}
	public static void main(String[] args)
	{
		method();
		System.out.println("Main method");
	}
	public static void method()
	{
		System.out.println("Y : " +y);
	}
	static
	{
		System.out.println("Second Static Block");
	}
	static int y = 200;
}

/*
output :
	Y : 0
	First static Block
	Second Static Block
	Y : 200
	Main method
*/