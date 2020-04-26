import java.util.*;
class E2
{
	int i;
	E2(int i)
	{
		this.i =i;
	}
	public String toString()
	{
		return "i= "+i;
	}
}
class E
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("abc", "element");
		m.put(1, 231);
		m.put('a', 124);
		m.put(500, 12.35);
		m.put(new E2(12), new E2(10));
		m.put(new E2(12), new E2(20));
		System.out.println(m);
		
		Set set = m.keySet();
		Iterator it = set.iterator();
		Object key, value;
		while(it.hasNext())
		{
			key = it.next();
			value = m.get(key);
			System.out.println(key + ","+m.get(key));
		}
	}
}