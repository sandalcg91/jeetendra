import java.util.*;
class E1
{
	int i;
	E1(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return Integer.toString(i);
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object o)
	{
		E1 e = (E1)o;
		return i == e.i;
	}
}
class E
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add(new E1(9));
		h1.add(new E1(9));
		h1.add(new E1(90));
		h1.add(new E1(90));
		h1.add(new E1(5));
		h1.add(new E1(5));
		System.out.println(h1); // [5, 90, 9]
	}
}