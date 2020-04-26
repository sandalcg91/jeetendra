
// This keyword can also be used to return the current class instance

class CurrentClass
{
	CurrentClass getCC()
	{
		return this;
	}
	void msg()
	{
		System.out.println("Hello Java");
	}
}
class ReturnCurrentClassInstance
{
	public static void main(String[] args)
	{
		new CurrentClass().getCC().msg();
	}
}

// output : Hello Java