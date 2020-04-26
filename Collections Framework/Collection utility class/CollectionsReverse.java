import java.util.*;
class CollectionsReverse
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(13);
		al.add(23);
		al.add(43);
		al.add(33);
		al.add(10);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
	}
}