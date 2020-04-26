import java.util.*;
public class TreeMapImplComparator
{
	public static void main(String[] args)
	{
		TreeMap m = new TreeMap(new MyComparator());
		m.put("XXXX", 10);
		m.put("SS", 20);
		m.put("ZZ", 30);
		m.put("TT", 40);
		System.out.println(m);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}