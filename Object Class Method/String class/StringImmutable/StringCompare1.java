class StringCompare1
{
	public static void main(String[] args)
	{
		String s1 = new String("Chandan");
		s1.concat(" gupta");
		String s2 = s1.concat(" Gupta");
		
		System.out.println(s1==s2); // false
	}
}