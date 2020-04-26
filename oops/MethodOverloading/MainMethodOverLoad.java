
// We can OverLoad the Main method

class MainMethodOverLoad
{
	public static void main(String[] args)
	{
		MainMethodOverLoad mmol = new MainMethodOverLoad();
		mmol.main("sandal");
		mmol.main("CG","CHandan");
		
		System.out.println("main(String[] args)");
	}
	
	public static void main(String arg1)
	{
		System.out.println("main(String arg1)");
	}
	
	public static void main(String arg1, String arg2)
	{
		System.out.println("main(String arg1, String arg2)");
	}
}