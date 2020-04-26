import java.util.*;
class CollectionsSearchDemo1
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(13);
		al.add(23);
		al.add(43);
		al.add(33);
		al.add(10);
		System.out.println(al);
		
		Collections.sort(al, new MyComparator());
		System.out.println(al);

		System.out.println(Collections.binarySearch(al,10,new MyComparator()));  // 5
		System.out.println(Collections.binarySearch(al,20,new MyComparator()));  // -4

		System.out.println(Collections.binarySearch(al,26)); // -7
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}
}