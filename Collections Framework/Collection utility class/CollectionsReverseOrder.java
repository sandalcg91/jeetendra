import java.util.*;
class CollectionsReverseOrder
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
		
		Comparator c1 = Collections.reverseOrder(new MyComparator2());
		System.out.println(c1);
	}
}
class MyComparator2 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		return I2.compareTo(I1);
	}
}