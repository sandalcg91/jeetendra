class K
{
	int i;
	
	K(int i)
	{
		this.i = i;
	}
	
	public static void main(String[] args)
	{
		K k1 = new K(20);
		K k2 = new K(20);
		
		System.out.println(k1.equals(k2));  // false
	}
}