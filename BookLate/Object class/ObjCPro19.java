class S
{
	public static void main(String[] args)
	{
		S s1 = new S();
		S s2 = new S();
		
		String s5 = Integer.toHexString(564573);
	
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		
		System.out.println(s5);
	}
}