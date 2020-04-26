public class StringManipulation
{
	public static void main(String[] args)
	{
		String s1 = new String("chandan");
		String s2 = new String(" gupta");
		String s3 = new String("manish");
		String s4 = new String("Chandan");
		String s5 = new String("Gupta");
		
		// Length()
		System.out.println(s1.length());
		
		// concat()
		String s6 = s1.concat(s2);
		String s7 = s1+s2;
		System.out.println(s6);
		System.out.println(s7);
		
		// charAt()
		System.out.println(s1.charAt(2));
		
		// equals()
		System.out.println(s1.equals(s2));
		
		// equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s4));
		
		// substring()
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(1,5));
		
		// replace()
		System.out.println(s1.replace('a','n'));
		
		// replaceFirst()
		String s9 = "java is a java programming language";
		System.out.println(s9.replaceFirst("java", "mava"));
		
		// replaceAll()
		String s10 = "java is a java programming language";
		System.out.println(s10.replaceAll("java", "mava"));
		
		// toLowerCase()
		System.out.println(s4.toLowerCase());
		
		// toUpperCase()
		System.out.println(s3.toUpperCase());
		
		// trim
		String s8 = "    chandan   ";
		System.out.println(s8.trim());
		
		// indexOf()
		int a = s1.indexOf('a');
		System.out.println(a);
		
		// LastIndexOf()
		System.out.println(s1.lastIndexOf('n'));
		
		// StartsWith()
		System.out.println(s1.startsWith("c"));
		
		// EndsWith()
		System.out.println(s3.endsWith("h"));
		
		// subSequence()
		System.out.println(s1.subSequence(1,5));
		
		// matches()
		System.out.println(s3.matches("manish"));
		
		// contains()
		System.out.println(s1.contains("c"));
		
		// isEmpty()
		String s11 = "";
		System.out.println(s11.isEmpty());
		
		// split
		//String s12 = "You are very honest person of the city";
		//split(s12,3);
		
		// toCharArray
		char[] ch = s1.toCharArray();
		System.out.println(ch);
	}
}