import java.util.*;
class MainClass2
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<String>();
		l.add("Chandan Gupta");
		
		List<List<String>> ll = new ArrayList<List<String>>();
		ll.add(l);
		
		String s = ll.get(0).get(0);
		System.out.println(s);
	}
}