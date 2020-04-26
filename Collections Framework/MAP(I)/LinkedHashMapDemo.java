import java.util.*;
public class LinkedHashMapDemo
{
	public static void main(String[] args)
	{
		LinkedHashMap lm = new LinkedHashMap();
		lm.put("Manish", 100);
		lm.put("Chandan", 101);
		lm.put("Payal", 102);
		lm.put("Sandal", 103);
		
		System.out.println(lm);
		
	//	System.out.println(m.put("Manish", 103)); // 100
	//	System.out.println(m);
		
		Set s = lm.keySet();
		System.out.println(s);
		
		Collection c = lm.values();
		System.out.println(c);
		
		Set s1 = lm.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry) itr.next();
			
			System.out.println(m1.getKey()+"-----+++-----"+m1.getValue());
			
			if(m1.getKey().equals("Payal"))
				m1.setValue("200");
		}
		System.out.println(lm);
	}
}