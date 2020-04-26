class I
{
	int i;
	
	public static void main(String[] args)
	{
		I i1 = new I();
		I i2 = i1;
		i1.i = 90;
		i2.i = 90;
		System.out.println(i1==i2);
	}
}