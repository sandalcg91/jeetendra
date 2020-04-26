import java.util.*;
class IteratorDemo
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
	//	Vector v = new Vector();
		for(int i=0; i<=10; i++)
		{
			al.add(i);
		//	v.addElement(i);
		}
	    System.out.println(al);
		System.out.println("------------------");
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Integer I = (Integer)it.next();
			if(I%2==0)
			{
				System.out.println(I);
			}
			else
			{
				it.remove();
			}
		}
	}
}