class ConstPro2
{
	int i;
	String name;
	
	ConstPro2(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		ConstPro2 cp = new ConstPro2("Chandan");
		ConstPro2 cp1 = new ConstPro2("Manish");
		System.out.println(cp);     // toString() called here
		System.out.println(cp1);	// toString() called here
	}
}