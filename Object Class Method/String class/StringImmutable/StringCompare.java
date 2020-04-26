class StringCompare
{
	public static void main(String[] args)
	{
		String s1 = new String("Chandan");
		String s2 = new String("Chandan");
		
		String s3 = "Chandan";
		String s4 = "Chandan";
		
		System.out.println(s1==s2); // false
		System.out.println(s1==s3); // false
		System.out.println(s3==s4); // true
	}
}