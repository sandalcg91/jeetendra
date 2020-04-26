public class toStringMethod
{
	public static void main(String[] args)
	{
		// Form I
		// public String toString() - all wrapper classes 
		Character ch = new Character('A');
		String s = ch.toString();
		System.out.println(s); // System.out.println(s.toString());
		
		// Form II
		// public String toString(primitive p)
		String s1 = Integer.toString(100);
		String s2 = Boolean.toString(true);
		String s3 = Character.toString('A');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// Form III
		// public static String toString(primitive p, int radix) - I,L
		String s4 = Integer.toString(15,2);
		System.out.println(s4);
		
		String s5 = Long.toString(1234,8);
		System.out.println(s5);
		
		//String s6 = Character.toString('a',2);
		//System.out.println(s6);
		
		// Form IV
		// toXxxString()  // I, L
		String s7 = Integer.toHexString(15);
		String s8 = Long.toOctalString(20);
		String s9 = Long.toBinaryString(14);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
	}
}