class P
{
	int i;
	
	P(int i)
	{
		this.i = i;
	}
	
	public boolean equals(Object o)
	{
		P p = (P)o;
		return this.i==p.i;
	}

	public static void main(String[] args)
	{
		P p1 = new P(10);
		P p2 = new P(10);
		
		System.out.println(p1==p2);  // false
		System.out.println(p1.equals(p2));  // true
		
		Integer a1 = new Integer(10);
		Integer a2 = new Integer(10);
		
		System.out.println(a1==a2);  // false
		System.out.println(a1.equals(a2));  // true
	}
}