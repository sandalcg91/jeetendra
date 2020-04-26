class G extends Object
{
	int i = 90;
	public String toString()
	{
		return "i ="+i;
	}
	
	public static void main(String[] args)
	{
		G g = new G();
		g.i=50;
		System.out.println(g);
		
		g.i=70;
		System.out.println(g);
	}
}