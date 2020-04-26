class StringCompare2
{
	public static void main(String[] args)
	{
		String s1 = new String("Chandan");
		String s2 = s1.toLowerCase();
		String s3 = s2.toLowerCase();
		
		String s4 = s2.toUpperCase();
		String s5 = s1.toUpperCase();
		
		System.out.println(s2==s3); // true
		System.out.println(s4==s5); // false
	}
}