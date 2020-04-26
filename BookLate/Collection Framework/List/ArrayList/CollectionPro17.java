import java.util.*;
class P
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(12.34);
		al.add(2.3);
		al.add(10);
		al.add("abd");
		try
		{
			Collections.sort(al);
		}
		catch(ClassCastException e)
		{
			System.out.println("sorting can't be perform on diff data");
		}
		System.out.println(al);
	}
}