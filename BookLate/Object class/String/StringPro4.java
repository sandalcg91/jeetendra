public class StringPro4
{
	public static void main(String[] args)
	{
		String s1 = "chandan";
		String s2 = "gupta";
		
		String s3 = "gupta";
		String s4 = "chandan"+"gupta";
		
		String s5 = "chandangupta";
		String s6 = "chandan"+s2;
		
		System.out.println(s4);		
		System.out.println(s5);	
		System.out.println(s6);	
		System.out.println(s5==s6);	
		System.out.println(s4==s5);	
		System.out.println(s4==s6);	
		System.out.println(s5.equals(s6));
	}
}