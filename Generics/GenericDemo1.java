import java.util.*;
class GenericDemo1
{
	public static void main(String[] args)
	{
		List l = new ArrayList<Integer>();// not generic
		l.add(12);
		l.add(2);
		l.add(11);
		l.add(22);
		l.add("A");
		System.out.println(l.get(0));
		System.out.println(l.get(3));
		System.out.println(l);
	}
}