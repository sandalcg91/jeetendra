public class StringPro3
{
	public static void main(String[] args)
	{
		String s1 = "chandan";
		String s2 = new String("chandan");
		System.out.println(s2==s1);
		System.out.println(s1.equals(s2));		
		System.out.println(s1.hashCode());		
		System.out.println(s2.hashCode());	
	}
}