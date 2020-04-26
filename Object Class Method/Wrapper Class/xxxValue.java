public class xxxValue
{
	public static void main(String[] args)
	{
		Integer i = new Integer(130);
		System.out.println(i.intValue());
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		
		Character ch = new Character('v');
		System.out.println(ch.charValue());
		System.out.println(ch);
		
		Boolean b = new Boolean(true);
		System.out.println(b.booleanValue());
	}
}