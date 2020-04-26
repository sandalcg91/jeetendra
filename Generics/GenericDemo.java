import java.util.*;
class GenericDemo
{
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(2);
		l.add(11);
		l.add(22);
	//	l.add("A");
		System.out.println(l.get(0)+l.get(1));
		System.out.println(l);
	}
}