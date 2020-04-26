import java.util.*;
public class TreeSetDemo1
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("X"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("W"));
		
		System.out.println(ts); // CCS
	}
}