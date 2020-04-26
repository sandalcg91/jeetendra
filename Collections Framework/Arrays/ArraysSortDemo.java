import java.util.*;
class ArraysSortDemo
{
	public static void main(String[] args)
	{
		int[] a = {10,23,55,85,24,5,32};
		System.out.println("primitive array before Sorting :");
		for(int a1 : a)
		{
			System.out.print(a1+" ");
		}
		System.out.println("\n"+"-----------------------");
		Arrays.sort(a);
		System.out.println("Primitive array after Sorting :");
		for(int a1 : a)
		{
			System.out.print(a1+" ");
		}
		System.out.println("\n"+"-----------------------");
		String[] s = {"A","Z","B"};
		System.out.println("Object Array before Sorting :");
		for(String s1 : s)
		{
			System.out.print(s1+ " ");
		}
		System.out.println("\n"+"-----------------------");
		Arrays.sort(s);
		System.out.println("Object array after Sorting :");
		for(String s1 : s)
		{
			System.out.print(s1+ " ");
		}
		System.out.println("\n"+"-----------------------");
		Arrays.sort(s, new MyComparator());
		System.out.println("Object array after sorting by comparator :");
		for(String s1 : s)
		{
		System.out.print(s1+" ");
		}
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}