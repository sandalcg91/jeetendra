import java.util.*;
class TreeSetCamparator
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator());
	//	TreeSet t = new TreeSet();  // normal sorting order
		t.add(12);
		t.add(23);
		t.add(2);
		t.add(3);
		t.add(5);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)   // root Left Right (pre order traversal)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1<i2) 
		{
			return +100;
		}
		else if(i1>i2)
		{
			return -100;
		}
		else
		{
			return 0;
		}
	}
}