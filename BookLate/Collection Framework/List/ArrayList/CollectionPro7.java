import java.util.*;
class G
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(9);
		al.add(0);
		al.add(90);
		al.add(19);
		System.out.println(al);
		
		Object o = al.remove(2);
		System.out.println(al);
		System.out.println(o);
	//	o = al.remove(10);
	}
}