class F
{
	int i = 90;
	
	public static void main(String[] args)
	{
		Object o = new Object();
		F f = new F();
		F f1 = f;
		String s = f.toString();
		System.out.println(s);
		System.out.println(f.i);
		System.out.println(f);
		System.out.println(f1.i);
		System.out.println(f.toString());
		System.out.println(o.toString());
	}
}