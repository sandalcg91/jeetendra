import java.util.*;
class F1
{
	int i,j;
	F1(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "(" +i+"," +j+")";
	}
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		return hash;
	}
	public boolean equals(Object o)
	{
		return (o instanceof F1 && i == ((F1)o).i && j == ((F1)o).j); 
	}
}
class F
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add(new F1(1,2));
		h1.add(new F1(1,2));
		h1.add(new F1(2,1));
		h1.add(new F1(1,2));
		h1.add(new F1(1,3));
		h1.add(new E1(2));
		h1.add(new E1(9));
		h1.add(new D1(5));
		h1.add(new D1(3));
		h1.add(new D1(1));
		System.out.println(h1); // [2, (1,2), (2,1), (1,3), 1, 3, 5, 9]
	}
}