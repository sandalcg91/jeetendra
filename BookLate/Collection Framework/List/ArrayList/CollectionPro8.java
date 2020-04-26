import java.util.*;
class H
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(0);
		al.add(90);
		al.add(19);
		System.out.println(al);
		
		boolean flag = al.remove(new Integer(9));
		System.out.println(al);
		System.out.println(flag); // true
		flag = al.remove(new Integer(91));
		System.out.println(al);
		System.out.println(flag); // false
	}
}