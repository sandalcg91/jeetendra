import java.util.*;
class LinkedListIterator
{
	public static void main(String[] args)
	{
		LinkedList<Object> l = new LinkedList<Object>();

		l.add("sandal");
		l.add("CG");
		l.add("Payal");
		l.add("chandan");
		l.add("sandal");
		
		System.out.println(l); // [sandal, CG, Payal, chandan, sandal]
		
		ListIterator li = l.listIterator();
		while(li.hasNext())
		{
			String s = (String)li.next();
			System.out.println(s);
			
			if(s.equals("sandal"))
			{
				li.remove();
			}
			if(s.equals("CG"))
			{
				li.set("Manish");
			}
			if(s.equals("chandan"))
			{
				li.add("Gupta");
			}
		}
		System.out.println(l);
	}
}