import java.util.*;
class B
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(52);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(345);
		l.add(98);
		System.out.println("------------");
		System.out.println(l); // [52, 20, 30, 90, 345, 98]

	
		Collections.sort(l);
		System.out.println(l); // [20, 30, 52, 90, 98, 345]
		System.out.println("------------");
	
		Object o = l.poll();
		System.out.println(o);  // 52
		System.out.println(l.poll());  // 20 
		System.out.println(l); // [30, 90, 345, 98]
		System.out.println("-----------------");
		o = l.peek();
		System.out.println(o); // 30
		System.out.println(l.peek()); // 30
		System.out.println(l); // [30, 90, 345, 98]
	}
}