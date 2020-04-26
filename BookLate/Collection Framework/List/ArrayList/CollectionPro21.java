import java.util.*;
class T
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(0);
		al.add(90);
		al.add(19);
		al.add(81);
		al.add(80);
		al.add(18);
		al.add(83);
		System.out.println(al);
		
	/*	Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		
	//	al.add(345);
	//  System.out.println(al);
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
	*/
		System.out.println(" ");
		ListIterator lit = al.listIterator();
		lit.add(123);
	//  System.out.println(al);
		while(lit.hasNext())
		{
			System.out.print(lit.next()+",");
		}
		System.out.println(" ");
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous()+",");
		}
		System.out.println(" ");
		while(lit.hasNext())
		{
			System.out.print(lit.next()+",");
		}
	}
}