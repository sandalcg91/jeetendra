class Extra
{
	static int i=0;
	static int test1(int j)
	{
		i = j;
		return i++;
	}
	static int test2(int j)
	{
		i = j;
		return ++i;
	}
	
	public static void main(String[] args)
	{
		int j = i++ + test1(i++) + i++ + test2(++i);
		
		System.out.println(i);
		System.out.println(j);
	}
}