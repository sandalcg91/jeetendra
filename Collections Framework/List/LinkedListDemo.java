import java.util.*;
class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList<Object> l = new LinkedList<Object>();

		l.add("sandal");
		l.add(20);
		l.add(null);
		l.add("chandan");
		l.add("sandal");
		
		System.out.println(l); // [sandal, 20, null, chandan, sandal]
		
		l.set(0,"CG");
		System.out.println(l); // [CG, 20, null, chandan, sandal]
		
		l.add(0, "Gupta");
		System.out.println(l); // [Gupta, CG, 20, null, chandan, sandal]
		
		l.addFirst("Payal");
		System.out.println(l); // [Payal, Gupta, CG, 20, null, chandan, sandal]
		
		l.addLast("Gupta");
		System.out.println(l); // [Payal, Gupta, CG, 20, null, chandan, sandal, Gupta]
		
		l.removeFirst();
		System.out.println(l); // [Gupta, CG, 20, null, chandan, sandal, Gupta]
		
		l.removeLast();
		System.out.println(l); // [Gupta, CG, 20, null, chandan, sandal]
		
		System.out.println("Get 2nd position Object : " +l.get(2));  // 20
		
		l.set(4, "Payal");
		System.out.println(l); // [Gupta, CG, 20, null, Payal, sandal]
		
		System.out.println(l.indexOf(null)); // 3
		
		l.addLast(null);  // [Gupta, CG, 20, null, Payal, sandal, null]
		System.out.println(l.lastIndexOf(null)); // 6
		
		System.out.println(l.contains("Payal")); // true
		
		System.out.println("Size of List : " +l.size());
	
		}
	}
}