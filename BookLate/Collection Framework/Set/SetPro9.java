import java.util.*;
class I
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add(123);
		h1.add("abc");
		h1.add("xyz");
		h1.add(true);
		h1.add('a');
		System.out.println(h1);
		System.out.println(h1.add(123));
		Iterator it = h1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
} 	