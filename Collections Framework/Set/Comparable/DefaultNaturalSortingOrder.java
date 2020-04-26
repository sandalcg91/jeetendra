import java.util.*;
public class DefaultNaturalSortingOrder
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add("F"); // It is Inserted as a root
		ts.add("X"); // "X".compareTo("F") ==>  +ve
	    ts.add("G"); // "G".compareTo("F") ==>  +ve
		ts.add("Z"); // "Z".compareTo("F") ==>  +ve
		ts.add("A"); // "A".compareTo("F") ==>  -ve
		
		System.out.println(ts);  // [A, F, G, X, Z]
	//	ts.add(null); // NPE
	}
}