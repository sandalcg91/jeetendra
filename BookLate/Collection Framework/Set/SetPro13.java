import java.util.*;
class M1
{
	int i;
	M1(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i : "+i;
	}
}
class M
{
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		t1.add(new M1(10));
		t1.add(new M1(40));
		t1.add(new M1(30));
		t1.add(new M1(60));
		System.out.println("Done");
		System.out.println(t1.toString());  // ClassCastERxception - should be implements comparable
	}
}