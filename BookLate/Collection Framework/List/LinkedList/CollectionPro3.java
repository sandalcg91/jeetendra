import java.util.*;
class C
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(52);
		l.add("abc");
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(23.43);
		l.add(345);
		l.add(982);
		l.add(348);
		System.out.println("------------");
		System.out.println(l); // 

		System.out.println(l.remove(1));
		System.out.println(l); // 
		System.out.println("------------");
	
		System.out.println(l.remove(4));
		System.out.println(l);  //
		
		System.out.println(l.remove());
		System.out.println(l);
		
		System.out.println(l.removeFirst());
		System.out.println(l);
		
		System.out.println(l.removeLast());
		System.out.println(l);
	}
}