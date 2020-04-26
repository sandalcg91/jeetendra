import java.util.*;
class E
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(90);
		al.add("abc");
		al.add('s');
		al.add(true);
		al.add(235.52);
		System.out.println(al);
		
		al.add("xyz");
		System.out.println(al);
		
		al.add(2,"check");
		System.out.println(al);
	}
}