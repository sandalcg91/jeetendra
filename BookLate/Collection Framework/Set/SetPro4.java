import java.util.*;
class D1 implements Comparable
{
	int i;
	D1(int i)
	{
		this.i=i;
	}
	public int compareTo(Object o)
	{
		return ((D1)o).i-i;
	}
	public String toString()
	{
		return Integer.toString(i);
	}
}
class D
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add("abc");
		h1.add("abc");
		System.out.println(h1);
	
	    HashSet h2 = new HashSet();
		h2.add(90);
		h2.add(90);
		System.out.println(h2);
	
	    HashSet h3 = new HashSet();
		h3.add(true);
		h3.add(true);
		System.out.println(h3);
	
		HashSet h4 = new HashSet();
		h4.add(new StringBuffer("abc"));
		h4.add(new StringBuffer("abc"));
		System.out.println(h4);
		
		HashSet h5 = new HashSet();
		h5.add(new D1(10));
		h5.add(new D1(10));
		System.out.println(h5);
	}
}