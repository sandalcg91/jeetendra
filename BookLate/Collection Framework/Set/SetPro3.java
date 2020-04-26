import java.util.*;
class C
{
	public static void main(String[] args)
	{
		byte b = 90;
		int i =90;
		short s = 90;
		HashSet h = new HashSet();
		h.add(901);
		h.add(90.0);
		h.add(90);
		h.add(b);
		h.add(i);
		h.add(s);
		System.out.println(h); // [901, 90.0, 90, 90, 90]
	}
}