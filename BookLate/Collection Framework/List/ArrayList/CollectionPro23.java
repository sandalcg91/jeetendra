import java.util.*;
class V
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(90);
		v.add(20);
		v.add(30);
		v.add(34);
		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}