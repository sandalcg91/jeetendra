class Parent
{
	void m()
	{
		System.out.println("Hello");
	}
}
class CheckedExpChild extends Parent
{
	void m() // throws IOException    //m() in CheckedExpChild cannot override m() in Parent "void m() throws IOException" 
									  // Checked Exception can't declare 
	{
		System.out.println("hii");
	}
	
	public static void main(String[] args)
	{
		CheckedExpChild cec = new CheckedExpChild();
		cec.m();
	}
}
class CheckedExpChild1 extends Parent
{
	void m() throws RuntimeException  //m() in CheckedExpChild can override m() in Parent "void m() throws RuntimeException" 
									  // Unchecked Exception can declare only
	{
		System.out.println("hii");
	}
	
	public static void main(String[] args)
	{
		CheckedExpChild1 cec1 = new CheckedExpChild1();
		cec1.m();
	}
}