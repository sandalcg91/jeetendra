import java.util.*;
class C
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("abc", "element");
		m.put(null, "abc");
		m.put(123,null);
		m.put("abc","value");
		m.put(null, "sdf");
		System.out.println(m.get("abc"));
		System.out.println(m.get(null));
		System.out.println(m.get(123));
	}
}