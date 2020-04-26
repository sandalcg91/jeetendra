class R
{
	String name;
	
	R(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return name;
	}

	public static void main(String[] args)
	{
		R r1 = new R("Chandan");
		R r2 = new R("Payal");
		R r3 = new R("Manish");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		Integer i = new Integer(10);
		System.out.println(i.toString());
	}
}