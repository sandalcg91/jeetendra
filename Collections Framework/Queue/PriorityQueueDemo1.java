import java.util.*;
class PriorityQueueDemo1
{
	public static void main(String[] args)
	{
		PriorityQueue q = new PriorityQueue(15, new MyComparator1());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q); // 
	}
}

class MyComparator1 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = (String)o1;
		String s2 = o2.toString();
		return s1.compareTo(s2); // [A, B, L, Z]
	//	return s2.compareTo(s1);
	}
}