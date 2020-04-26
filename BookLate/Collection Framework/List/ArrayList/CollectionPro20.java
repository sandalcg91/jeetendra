import java.util.*;
class S1 implements Comparable
{
	int i;
	S1(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i=" +i;
	}
	public int compareTo(Object o)
	{
		S1 s = (S1)o;
		return s.i-i;
	}
}
class S
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(new S1(10));
		al.add(new S1(50));
		al.add(new S1(30));
		al.add(new S1(40));
		al.add(new S1(20));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}