public class WCPro1
{
	public static void main(String[] args)
	{
		int i =90;
		Integer i1 = new Integer(80);
		Integer i2 = new Integer("80");
		Integer i3 = new Integer(i);
		
		Integer i4 = Integer.valueOf(5000); // first form  
		Integer i5 = Integer.valueOf("101010", 2); //  Second form  
		Integer i6 = Integer.valueOf("015", 8);  //  Second form
		Integer i7 = Integer.valueOf("b", 16);  //  Second form
		Integer i8 = Integer.valueOf(i);  // Third Form
		Integer i9 = Integer.valueOf("5000");  // first form
		
		System.out.println("i = "+i);
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		System.out.println("i4 = "+i4);
		System.out.println("i5 = "+i5);
		System.out.println("i6 = "+i6);
		System.out.println("i7 = "+i7);
		System.out.println("i8 = "+i8);
		System.out.println("i9 = "+i9);
	}
}