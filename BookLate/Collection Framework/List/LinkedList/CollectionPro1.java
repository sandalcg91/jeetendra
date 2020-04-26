import java.util.*;
class A
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add("abc");
		l.add("20");
		l.add(30);
		System.out.println(l);

		System.out.println("------------");
		System.out.println(l.get(0));
		
		System.out.println("------------");
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
	}
}