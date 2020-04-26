class StaticPro4
{
	public static void main(String[] args)
	{
		String s1 = "Java is a Programming Language";
		String s2[] = s1.split(" ");
		for(String s:s2)
		{
			StringBuffer b = new StringBuffer(s);
			System.out.print(b.reverse()+" ");
		}
	}
}