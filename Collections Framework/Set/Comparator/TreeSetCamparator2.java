import java.util.*;
class TreeSetCamparator2
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);  // [A, AA, XX, ABC, ABCD]
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		if(i1<i2)
		{
			return -1;
		}
		else if(i1>i2)
		{
			return +1;
		}
		else
		{
			return s1.compareTo(s2);
		}
	}
}