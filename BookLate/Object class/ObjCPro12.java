class L
{
	int i,j;
	
/*	L(int i)
	{
		this.i = i;
	}
*/	
	public boolean equals(Object o)
	{
		L l = (L)o;
		return (this.i==l.i)&(this.j==l.j);
	}

	public static void main(String[] args)
	{
		L l1 = new L();
		L l2 = new L();
		
		l1.i=90;
		l2.i=90;
		l1.j=70;
		l2.j=70;
		
		System.out.println(l1.equals(l2));  // true
	}
}