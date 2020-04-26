import java.util.*;
class K
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
	//	System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(19);
		al1.add(20);
		al1.add(18);
	
		System.out.println(al);
		System.out.println(al1);
		System.out.println("-------------");
		al.retainAll(al1);
		System.out.println(al);
		System.out.println(al1);
	}
}