import java.util.*;
public class TreeSetComparable
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		System.out.println("A".compareTo("Z"));  // -ve  obj1 has to come before obj2
		System.out.println("X".compareTo("A"));  // +ve  obj1 has to come after obj2
		System.out.println("A".compareTo("A"));  // 0    obj1 and obj2 are equals
    }
}