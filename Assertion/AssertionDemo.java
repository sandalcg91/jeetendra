class AssertionDemo
{
	public static void main(String[] args)
	{
		int x = 10;
		// simple
	//	assert(x>10);
		System.out.println(x);
		
		// Augmented
		int y =10;
		assert(y>10):"here y value should be >10 but it is not";
		System.out.println(y);
	}
}