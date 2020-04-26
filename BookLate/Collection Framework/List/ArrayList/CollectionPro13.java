import java.util.*;
class LinkedList1
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(2);
		l.add(9);

		System.out.println(l);
		
		Object o = l.poll();
		System.out.println(o); // 10
		System.out.println(l); // 10 remove
		System.out.println(l.peek()); // 20
		System.out.println(l); // 20 doesn't remove
		System.out.println(l.removeFirst()); // 20
		System.out.println(l.removeLast()); // 9
		System.out.println(l); // [30, 2]
	}
}