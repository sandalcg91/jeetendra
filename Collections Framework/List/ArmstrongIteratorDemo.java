import java.util.*;
class ArmstrongIteratorDemo
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<=10; i++)
		{
			al.add(i);
		}
	    System.out.println(al);
		System.out.println("------------------");
		
		al.add(153); // 1+125+27
		al.add(371); // 27+343+1
		System.out.println(al);
		System.out.println("------------------");
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Integer I = (Integer)it.next();
			int m = I, a=0, temp =I, r;
			while(m>0)
			{
				r = m%10;
				m = m/10;
				a = a+r*r*r;
			}
			if(temp!=a)
			{
				it.remove();
			}
		}
		System.out.println(al);
	}
}