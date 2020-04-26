import java.util.*;
class N1 implements Comparable
{
	int i;
	N1(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i:"+i;
	}
	public int compareTo(Object o)
	{
		return i-((N1)o).i;
	}
}
class N
{
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		t1.add(new N1(10));
		t1.add(new N1(40));
		t1.add(new N1(20));
		t1.add(new N1(3));
		t1.add(new N1(13));
		t1.add(new N1(31));
		System.out.println(t1);
	}
}