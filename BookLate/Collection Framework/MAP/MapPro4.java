import java.util.*;
class D
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("abc", "element");
		m.put("abc", 231);
		m.put("abc", 124);
		m.put(500, 12.35);
		m.put(null, null);
		System.out.println(m);
		System.out.println(m.get("abc"));
		System.out.println(m.get(231));
		System.out.println(m.get(null));
	}
}