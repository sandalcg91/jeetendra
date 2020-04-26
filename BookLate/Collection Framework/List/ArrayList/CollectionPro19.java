import java.util.*;
class R1
{
	int i;
	R1(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i=" +i;
	}
}
class R
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add(90);
		al.add(new R1(110));
		al.add(new R1(120));
		System.out.println(al);
	}
}