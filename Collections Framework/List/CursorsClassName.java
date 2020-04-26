import java.util.*;
public class CursorsClassName
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator it = v.iterator();
		ListIterator lit = v.listIterator();
		System.out.println(e.getClass().getName());   // java.util.Vector$1
		System.out.println(it.getClass().getName());  // java.util.Vector$Itr
		System.out.println(lit.getClass().getName()); // java.util.Vector$ListItr
	}
}