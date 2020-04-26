
// Call method through this() 

class CallMethodThis
{
	void show()
	{
		System.out.println("Show Method");
	}
	void marks()
	{
		this.show();
	}
	void display()
	{
		marks();
	}
	
	public static void main(String[] args)
	{
		CallMethodThis c = new CallMethodThis();
		c.display();
		c.marks();
		c.show();
	}
}