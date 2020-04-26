public class parseXxx
{
	public static void main(String[] args)
	{
		// Form I
		// public static primitive parseXxx(String s)  - except char
		int i = Integer.parseInt("100");
		boolean b = Boolean.parseBoolean("true");
		double d = Double.parseDouble("15.4");
		
		System.out.println(i);
		System.out.println(b);
		System.out.println(d);
		
		// Form II
		// public static primitive parseXxx(String d,int radix) -  B,S,I,L
		int ii = Integer.parseInt("1110",2);
		System.out.println(ii);
	}
}