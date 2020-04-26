import java.util.*;
public class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
	//	ts.add(null);  // upto 1.6 version it is possible
		ts.add("A");
		ts.add("B");
	    ts.add("a");
		ts.add("Z");
		ts.add("L");
		
		System.out.println(ts); // [A, B, L, Z, a] sorted according to some sorting order (asc)
	//	ts.add(10);  // CCE
	//	ts.add(null);  // NPE
	}
}