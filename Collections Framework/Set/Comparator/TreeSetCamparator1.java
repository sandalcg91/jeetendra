import java.util.*;
class TreeSetCamparator1
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add("A");
		t.add("Z");
		t.add("K");
		t.add("B");
		t.add("a");
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)   // root Left Right (pre order traversal)
	{
		String s1 = (String)o1;
		String s2 = (String)o2;
	//	return -s1.compareTo(s2);  // [a, Z, K, B, A]
	//	return s1.compareTo(s2);   // [A, B, K, Z, a]
	//	return -s2.compareTo(s1);  // [A, B, K, Z, a]
	//	return s2.compareTo(s1);   // [a, Z, K, B, A]
    //	return -1;  //  [a, B, K, Z, A]
	//	return +1;  //  [A, Z, K, B, a]
	//	return 0; // [A]
	}
}