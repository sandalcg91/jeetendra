public class AutoBoxingUnboxing
{
	public static void main(String[] args)
	{
		Integer I = 10;   // AutoBoxing  -  int to Integer
		// Integer I = Integer.valueOf(10);
		System.out.println(I);
		
		Integer I1 = new Integer(10);
		int i = I1;  //  Auto-Unboxing
		// int i = I1.intValue();
		System.out.println(i);
	}
}