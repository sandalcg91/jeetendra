
// java.base/java.lang.Object cannot be cast to java.base/java.lang.String

class ClassCastExp
{
	public static void main(String[] args)
	{
		//String s = new String("CHandan");
		//Object o = (Object)s;
		
		try
		{
			Object o = new Object();
			String s = (String)o;
		}
		catch(ClassCastException cce)
		{
			System.out.println("Exception Occur " +cce);
		}
	}
}