import java.util.*;
class F
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(0);
		al.add(90);
		al.add(19);
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add(9);
		al1.add(100);
		al1.add(90);
		al1.add(110);
		al1.add(123);
		System.out.println(al1);
		
		al1.removeAll(al);
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add(29);
		al2.add(20);
		al2.add(290);
		al2.addAll(al1);
		al2.add(219);
		System.out.println(al2);
		al.addAll(2, al1);
		System.out.println(al);
	}
}