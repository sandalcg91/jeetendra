import java.util.*;
class A
{
	public static void main(String[] args)
	{
		HashSet h = new HashSet();
		h.add(90);
		h.add(90);
		h.add(90);
		h.add(90);
		System.out.println(h.size()); // 1
		System.out.println(h); // [90]
		System.out.println(h.add(9)); // true
		System.out.println(h.size()); // 2
		System.out.println(h); // [9, 90]
	}
}