import java.util.*;
class D
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(90);
		al.add("abc");
		al.add('s');
		al.add(true);
		al.add(235.52);
		System.out.println("Classical for loop");
		System.out.println("==========================");
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("enhanced for loop");
		System.out.println("==========================");
		for(Object obj : al)
		{
			System.out.println(obj + ",");
		}
		System.out.println("toString() method");
		System.out.println("==========================");
		System.out.println(al);
	}
}