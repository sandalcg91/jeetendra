import java.util.*;
class Stack
{
	private LinkedList list = new LinkedList();
	public void add(Object o)
	{
		list.add(o);
	}
	public Object processElement()
	{
		return list.removeLast();
	}
	public String toString()
	{
		return list.toString();
	}
}
class E
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.add("abc");
		s.add(20);
		s.add(30);
		s.add(982);
		
		System.out.println(s);                      
		System.out.println(s.processElement());
		
		System.out.println(s);
		System.out.println(s.processElement());
		
		System.out.println(s);
		System.out.println(s.processElement());
		System.out.println(s);
	}
}