class N1
{
	int i=90;
	public String toString()
	{
		return "i= "+i;
	}
}
class N extends N1
{
	public static void main(String[] args)
	{
		N n = new N();
		System.out.println(n);
	}
}