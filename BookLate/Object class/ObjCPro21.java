class U
{
	Integer i =90,j;
	
	public String toString()
	{
		
		return new Integer(20).toString();
	}
	
	public static void main(String[] args)
	{
		U u = new U();
		U u1 = new U();

		System.out.println(u); // 20
		System.out.println("------------------");
		System.out.println(u1); // 20
	}
}