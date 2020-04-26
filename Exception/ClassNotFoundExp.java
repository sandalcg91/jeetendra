class ClassNotFoundExp
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("cg.class");
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println("getting Exception " +cnfe);
		}
	}
}