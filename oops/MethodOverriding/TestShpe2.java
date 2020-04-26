class TestShape2
{
	public static void main(String[] args)
	{
		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		double totalArea = 0;
		for(int i=0; i<s.length; i++)
		{
			totalArea = totalArea + s[i].area();
		}
		System.out.println("Total Area of all : "+totalArea);
	}
}