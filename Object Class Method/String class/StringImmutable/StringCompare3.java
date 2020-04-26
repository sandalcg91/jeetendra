class StringCompare3
{
	public static void main(String[] args)
	{
		String s1 = "Chandan";
		String s2 = s1.toLowerCase();
		
		String s3 = "chandan";
		
		String s4 = "chandan".toLowerCase();
		String s5 = s3.toUpperCase();
		String s6 = s3.toLowerCase();
		
		System.out.println(s2==s3); // false
		System.out.println(s4==s5); // false
		System.out.println(s4==s6); // truefinally
	}
}