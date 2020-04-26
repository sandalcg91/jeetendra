class Food
{
	public void taste()
	{
		System.out.println("Spicy");
	}
}
class AnnoInnerClass
{
	public static void main(String[] args)
	{
		Food fd = new Food()
		{
			public void taste()
			{
				System.out.println("Salty");
			}
		};
		fd.taste();
		
		Food fd1 = new Food()
		{
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		fd1.taste();
		Food fd2 = new Food();
		fd2.taste();
	}
}