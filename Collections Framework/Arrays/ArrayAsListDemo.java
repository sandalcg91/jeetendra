import java.util.*;
class ArrayAsListDemo
{
	public static void main(String[] args)
	{
		String[] s = {"Z","F","R","T"};
		List l = Arrays.asList(s);
		
		System.out.println(l);
		s[0] = "K";
		System.out.println(l);
		l.set(1,"L");
		for(String s1 : s)
		{
			System.out.println(s1);
		}
	//	l.add("sandal"); // USOE
	//	l.remove(2);  // USOE
		l.set(1,"S");
	//	l.set(1, 10); // ASE
		System.out.println(l);
	}
}