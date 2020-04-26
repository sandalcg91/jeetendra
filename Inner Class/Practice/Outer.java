
class Outer    //   public, <default>, final, abstract, strictfp
{
	class Inner   //   public, <default>, final, abstract, strictfp  + private, protected, static
	{
	/*  public static void main(String[] args)
		{
			System.out.println("Outer class main method");
		}*/                                                     //  ce : static member can't declare inside Inner classes
		
		public void m1(int a, int b)
		{
			System.out.println("Sum of Two Numbers : "+(a+b));
		}
	}
	public static void main(String[] args)
	{
	//	Outer o = new Outer();
	//	Outer.Inner i = o.new Inner();
	//	i.m1(12, 23);
	
	//	Outer.Inner i = new Outer().new Inner();
	//	i.m1(11,11);
	
	//	new Outer().new Inner().m1(12,12);
	}
}