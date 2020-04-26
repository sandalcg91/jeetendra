import java.util.*;
public class RemoveDuplicatesFromList
{
	public static void main(String[] args)
	{
		List l = new ArrayList();
		l.add(12);
		l.add(13);
		l.add(12);
		l.add(15);
		l.add(13);
		l.add(11);
		l.add(16);
		System.out.println(l);
		System.out.println(l.size());
		
		Set s = new HashSet(l);
		System.out.println(s);
		System.out.println(s.size());
		
		LinkedHashSet lhs = new LinkedHashSet(l);
		System.out.println(lhs);
		System.out.println(lhs.size());
	}
}