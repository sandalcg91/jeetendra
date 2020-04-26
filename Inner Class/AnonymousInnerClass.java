class PopCorn
{
	public void taste()
	{
		System.out.println("Salty");
	}
}
class AnonymousInnerClass
{
	public static void main(String[] args)
	{
		PopCorn p = new PopCorn()      // object of AnonymousInnerClass$1.class
		{
			public void taste()
			{
				System.out.println("Spicy");
			}
		};
		p.taste(); // Spicy
		
		PopCorn p1 = new PopCorn();
		p1.taste();  // Salty
		
		PopCorn p2 = new PopCorn()     // object of AnonymousInnerClass$2.class
		{
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		p2.taste();  // Sweet
		
		System.out.println(p.getClass().getName());   // AnonymousInnerClass$1
		System.out.println(p1.getClass().getName());  // PopCorn
		System.out.println(p2.getClass().getName());  // AnonymousInnerClass$2
	}
}