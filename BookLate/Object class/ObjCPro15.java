class O
{
	int i=90;

	public static void main(String[] args)
	{
		O o = new O();
		O o1 = new O();
		o.i =80;
		o1.i =80;
		System.out.println(o==o1); // false
		System.out.println(o.equals(o1));  // false
	}
}