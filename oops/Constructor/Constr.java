class Constr
{
	int x;
	double d;
	
	Constr(int a)
	{
		x=a;
	}
	Constr(int a, double b)
	{
		x=a;
		d=b;
	}
	Constr(double b)
	{
		d=b;
	}
	Constr()
	{}
	
	void Constr()
	{
		System.out.println("Normal Methods");
	}
	
	void show()
	{
		System.out.println(" Integer : " +x + " Double : " +d);
	}
	
	public static void main(String[] args)
	{
		Constr c = new Constr(11);
		c.show();
		
		Constr c1 = new Constr(21.4);
		c1.show();
		
		Constr c2 = new Constr(123, 42.5);
		c2.show();
		
		Constr c3 = new Constr();
		c3.show();
		
		c.Constr();
	}
}