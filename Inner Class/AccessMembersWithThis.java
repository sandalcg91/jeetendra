// With in the inner class this always pointing to current Innerclass object

class Outer4
{
	int x = 10;
	
	class Inner4  //final/abstract/strictfp
	{
		int x = 200;
	
		public void m()
		{
			int x = 3000;
			System.out.println("Inner class method");
			System.out.println(x); // 3000
			System.out.println(this.x);  // 200
			System.out.println(Outer4.this.x);  // 10
		}
	}

	public static void main(String[] args)
	{
		new Outer4().new Inner4().m();
	}
}