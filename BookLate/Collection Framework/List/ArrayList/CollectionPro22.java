import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class U
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(0);
		al.add("xyz");
		al.add(90);
		al.add(19);
		al.add(81);
		al.add("xyb");
		al.add(80);
		al.add(18);
		al.add(83);
		System.out.println(al);

		ListIterator lit = al.listIterator();
	//  al.add(345);
		while(lit.hasNext())
		{
			Object o = lit.next();
			
			if(o.equals("xyz"))
			{
				lit.set("abc");
			}
		}
		System.out.println(al);
	}
}
