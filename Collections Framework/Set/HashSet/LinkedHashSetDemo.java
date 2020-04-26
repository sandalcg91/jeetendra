import java.util.*;
class LinkedHashSetDemo
{
	public static void main(String[] args)
	{
		LinkedHashSet h = new LinkedHashSet();
		h.add("S");
		h.add("D");
		h.add("A");
		h.add("G");
		h.add(12);
		h.add(null);
		System.out.println(h);
		System.out.println(h.add("A"));  // false
		System.out.println(h.add(null));  // false
		
		h.remove(12);
		System.out.println(h);
		
		h.add("E");
		System.out.println(h);
		
		h.add('l');
		System.out.println(h);
	}
}