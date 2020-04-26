public class ValueOfMethod
{
	public static void main(String[] args)
	{
		// form I
		// public static Wrapper valueOf(String s)
		
		Integer i = Integer.valueOf("123");
		System.out.println(i);
		
		Byte bt = Byte.valueOf("127");
		System.out.println(bt);
		
		Double d = Double.valueOf("1.5");
		System.out.println(d);
		
		Boolean b = Boolean.valueOf("true");
		System.out.println(b);
		
		// form II
		// public static Wrapper valueOf(String s, int radix("2 to 36")) -  Byte, Short, Integer, Long
		Integer I = Integer.valueOf("1111",2);
		System.out.println(I);
		
		Integer I1 = Integer.valueOf("234",5); // 2*5^2 + 3*5^1 + 4*5^0
		System.out.println(I1);
		
		// from III
		// public static Wrapper valueOf(primitive p) all wrapper class including char
		Integer ii = Integer.valueOf(30);
		System.out.println(ii);
		
		Character ch = Character.valueOf('B');
		System.out.println(ch);
	}
}