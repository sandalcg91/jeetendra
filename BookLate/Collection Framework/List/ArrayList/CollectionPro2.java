import java.util.*;
class B
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(90);
		al.add(true);
		int i = (Integer)al.get(0);
		boolean flag = (Boolean)al.get(1);
		System.out.println(i); // 90
		System.out.println(flag); // true
		System.out.println(al.get(0));  // 90
	}
}