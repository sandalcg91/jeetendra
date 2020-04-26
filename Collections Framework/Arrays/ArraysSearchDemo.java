import java.util.*;
class ArraysSearchDemo
{
	public static void main(String[] args)
	{
		int[] a = {10,23,55,85,24,5,32};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a,55)); // 5
		System.out.println(Arrays.binarySearch(a,84)); // -7
		
		String[] s = {"Z","F","R","T"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s,"Z")); // 3
		System.out.println(Arrays.binarySearch(s,"S")); // -3
		
		Arrays.sort(s, new MyComparator());
		System.out.println(Arrays.binarySearch(s,"Z", new MyComparator()));  // 0
		System.out.println(Arrays.binarySearch(s,"S", new MyComparator()));  // -3
		System.out.println(Arrays.binarySearch(s,"N"));  // -1
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