import java.util.*;
class G1
{
	int i,j;
	G1(int i, int j)
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
		System.out.println("hashCode()");
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int i = s1.hashCode();
		i = i + s2.hashCode();
		return i;
	}
	public boolean equals(Object o)
	{
		System.out.println("equals");
		return (i == ((G1)o).i && j == ((G1)o).j); 
	}
}
class G
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add(new G1(1,1));
		h1.add(new G1(1,1));
		h1.add(new G1(1,1));
		h1.add(new G1(2,1));
		h1.add(new G1(1,2));
		h1.add(new G1(2,1));
		System.out.println(h1.size());
		System.out.println(h1);
	}
}
/*
hashCode()
hashCode()
equals
hashCode()
equals
hashCode()
hashCode()
equals
hashCode()
equals
3
[(1,1), (2,1), (1,2)]
*/