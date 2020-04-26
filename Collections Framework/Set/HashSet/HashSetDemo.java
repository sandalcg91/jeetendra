import java.util.*;
class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet h = new HashSet();
		h.add("S");
		h.add("D");
		h.add("A");
		h.add("G");
		h.add(12);
		h.add(null);
		System.out.println(h);
		System.out.println(h.add("A"));  // false

		h.add("I");
		System.out.println(h);
		
		h.add('a');
		System.out.println(h);
	}
}