import java.util.*;
class N
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(0);
		al.add(90);
		al.add(19);
		al.add(81);
		al.add(80);
		al.add(18);
		al.add(83);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}
}