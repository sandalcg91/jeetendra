class J
{
	int i;
	
	J(int i)
	{
		this.i = i;
	}
	
	public static void main(String[] args)
	{
		J j1 = new J(20);
		J j2 = new J(20);

		System.out.println(j1==j2); // false
		System.out.println(j1.i==j2.i);  // true
	}
}