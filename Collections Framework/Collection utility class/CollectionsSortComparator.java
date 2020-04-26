import java.util.*;
class CollectionsSortComparator
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println(al);
		
		Collections.sort(al, new MyComparator());
		System.out.println(al);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = (String)o2;
		return -s2.compareTo(s1);
	}
}