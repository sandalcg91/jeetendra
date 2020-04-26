class V
{
	void test()
	{
		System.out.println("test");
	}
	
	public static void main(String[] args)
	{
		V v1 = new V();
		V v2 = new V();

		Class c1 = v1.getClass();
		Class c2 = v2.getClass();

		System.out.println(c1); // class V
		System.out.println(c2); // class V
		System.out.println(v1); // V@57fa26b7
		System.out.println(v2); // V@5f8ed237
		
		System.out.println(v1==v2); // false
		System.out.println(c1==c2); // true
	}
}