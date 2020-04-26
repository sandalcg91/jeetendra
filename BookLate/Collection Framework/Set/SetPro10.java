import java.util.*;
class J
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add(90);
		h1.add(0);
		h1.add(9);
		h1.add(19);
		h1.add(6);
		System.out.println(h1);  // Random sorting
		TreeSet t = new TreeSet(h1);
		System.out.println(t); // Default sorting order (asc)
	}
}