class DataHiding
{
	private int x = 10;
	
	public void m()
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		DataHiding dh = new DataHiding();
		dh.m();
		System.out.println(dh.x);
	}
}