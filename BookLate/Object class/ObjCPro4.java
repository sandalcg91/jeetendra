class D1
{
	int i;
	D1(int i)
	{
		this.i = i;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof D1)
		{
			D1 d = (D1) o;
			return this.i == d.i;
		}
		else
		{
			return false;
		}
	}
}
class D extends D1
{
	int i;
	D(int i)
	{
		this.i = i;
	}
	public static void main(String[] args)
	{
		D1 d1= new D1(10);
		D1 d2= new D1(10);

		D d3 = new D(10);

		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d3.equals(d1));
	}
}