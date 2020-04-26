import java.util.*;
class B
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("abc", "element");
		m.put(1,231);
		m.put('a',124);
		m.put(500,12.35);
		System.out.println(m.get("abc"));
		System.out.println(m.get(231));
		System.out.println(m.get(500));
	}
}