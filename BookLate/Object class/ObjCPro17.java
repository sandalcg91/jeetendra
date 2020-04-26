class Q
{
	int i;
	
	public boolean equals(Object o)
	{
		Q q = (Q)o;
		return this.i==q.i;
	}

	public static void main(String[] args)
	{
		Q q1 = new Q();
		Q q2 = new Q();
		q1.i=90;
		q2.i=90;
		
		System.out.println(q1==q2);  // false
		System.out.println(q1.i==q2.i);  // true
		System.out.println(q1.equals(q2));  // true
	}
}