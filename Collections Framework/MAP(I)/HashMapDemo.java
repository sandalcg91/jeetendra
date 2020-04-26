import java.util.*;
public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put("Manish", 100);
		m.put("Payal", 103);
		m.put("Sandal", 101);
		m.put("Chandan", 102);
		
		System.out.println(m);
		
		System.out.println(m.put("Manish", 103)); // 100
	//	System.out.println(m);
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);

		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			
			System.out.println(m1.getKey()+"-----+++-----"+m1.getValue());
			
			if(m1.getKey().equals("Payal"))
				m1.setValue("200");
		}
		System.out.println(m);
	}
}