class H
{
	int i;
	
	H(int i)
	{
		this.i = i;
	}
	
	public String toString()
	{
		return "i ="+i;
	}
	
	public static void main(String[] args)
	{
		H h1 = new H(10);
		System.out.println(h1);
		
		H h2 = new H(20);
		System.out.println(h2);
	}
}