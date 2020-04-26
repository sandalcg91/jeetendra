class X
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		X x = new X();
		Class c1 = x.getClass();
		Class c2 = Class.forName("objectClass.X"); // ClassNotFoundException
		Class c3 = X.class;

		System.out.println(c1==c2); // true
		System.out.println(c2==c3); // true
		System.out.println(c3==c1); // true
	}
}