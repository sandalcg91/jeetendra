class Deg
{
	int i;
	Deg()
	{
		i=10;
	}
	Deg(int k)
	{
		i=k;
	}
}
class D
{
	public static void main(String[] args)
	{
		Deg d1 = new Deg();
		System.out.println(d1.i); // 10
		Deg d2 = new Deg(12);
		System.out.println(d2.i);  // 12
	}
}