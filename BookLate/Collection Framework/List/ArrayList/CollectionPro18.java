import java.util.*;
class Q
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add("list");
		al.add("123");
		al.add("ABC");

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}