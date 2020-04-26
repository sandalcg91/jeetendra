import java.util.*;
class Queue 
{
	private LinkedList list = new LinkedList();
	public void add(Object o)
	{
		list.add(o);
	}
	public Object processElement()
	{
		return list.removeFirst();
	}
	public String toString()
	{
		return list.toString();
	}
}
class D
{
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.add("abc");
		q.add(20);
		q.add(30);
		q.add(90);
		q.add(345);
		q.add(982);
		System.out.println("------------");
		System.out.println(q);

		Object o1 = q.processElement();
		System.out.println(o1);
		o1 = q.processElement();
		System.out.println(o1);
		System.out.println(q);
	}
}