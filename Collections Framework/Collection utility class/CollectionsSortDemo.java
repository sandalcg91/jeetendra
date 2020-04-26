import java.util.*;
class CollectionsSortDemo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}
}