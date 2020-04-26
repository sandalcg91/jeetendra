class Outer  //(default)/public/strictfp/final/abstract
{
	class Inner  //(default)/public/private/protected/static/final/abstract/strictfp
	{
		int a = 23;
	//  static int b = 20;
	
		public void m()
		{
			System.out.println("Inner class Method");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Outer Class static Area");
		Outer o = new Outer();
		
		// Accessing innerclass object in outer class static area
		
		Outer.Inner i = o.new Inner();  //  I

		Outer.Inner i1 = new Outer().new Inner(); // II

		new Outer().new Inner().m();  // III
		
		i.m();
		
		i1.m();
	}
}