class StringBufferEquals
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Chandan");
		StringBuffer sb2 = new StringBuffer("Chandan");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));    // equals method in Stringbuffer class is not overriddent
												// Object class equals method invoked
	}
}