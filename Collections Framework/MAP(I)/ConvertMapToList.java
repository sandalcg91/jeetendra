import java.util.*;
public class ConvertMapToList
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put(1, "Manish");
		m.put(2, "Payal");
		m.put(3, "Sandal");
		m.put(4, "Chandan");
		
		System.out.println(m);
		System.out.println(m.size());
		
		List el = new ArrayList(m.entrySet());
		System.out.println(el.size());
	/*	Iterator it = el.iterator();
		while(it.hasNext())
		{
			String s = (String)it.next();
			System.out.println(s);
		}
*/	}
}