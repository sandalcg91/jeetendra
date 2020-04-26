class CustomizedExp
{
	public static void main(String[] args)
	{
		int age = Integer.parseInt(args[0]);
		if(age<18)
		{
			throw new TooYoungException("Please Wait Some more time");
		}
		else if(age>60)
		{
			throw new TooOldException("Your Age already crossed");
	//		System.out.println("123456789");
		}
		else
		{
			System.out.println("you will get much details soon by mail");
		}
	}
}