import java.util.*;
public class StringSplitDemo
{
	public static void main(String[] args)
	{
	/*	String str = "java is a programming language";
	//	Pattern p = Pattern.compile("\s");  // space character \s
		String[] s = p.split("\s");
		for(String s1 : s)
		{
			System.out.println(s1);
		}
	*/	
	    Pattern p1 = Pattern.compile("\\.");  // space character \s
		String[] ss = p1.split("www.facebook.com");
		for(String ss1 : ss)
		{
			System.out.println(ss1);
		}
		
		
	}
}