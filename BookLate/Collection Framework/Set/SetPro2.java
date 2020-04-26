import java.util.*;
class B
{
	public static void main(String[] args)
	{
		HashSet h = new HashSet();
		h.add(90);
		h.add(90);
		h.add(90);
		h.add(90);
		System.out.println(h.add(90)); // false
		System.out.println(h.add(90)); // false
		System.out.println(h); // [90]
	}
}