import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("A");
		al.add("B");
		al.add(10);
		al.add("CG");
		al.add(null);
		System.out.println(al);  // [A, B, 10, CG, null]
		
		al.remove(1);
		System.out.println(al);  // [A, 10, CG, null]
		
		al.add(1, "C");
		System.out.println(al); // [A, C, 10, CG, null]
		
		al.add("Sandal");
		System.out.println(al); // [A, C, 10, CG, null, Sandal]
		
		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add(12);
		al1.add("sg");
		al1.add("M");
		al1.add("C");
		
		System.out.println(al1); // {12, sg, M, C]
		
		System.out.println(al.isEmpty()); // false
		
		System.out.println(al1.contains("sg")); // true
		
		System.out.println(al.containsAll(al1)); // false
		
		System.out.println(al.addAll(al1)); // true
		System.out.println(al);  // [A, C, 10, CG, null, Sandal, 12, sg, M, C]
		
		System.out.println(al.containsAll(al1)); // true
		
		System.out.println("Get the object at 5th position : "+al.get(5)); // Sandal
		
		al.set(6,"PYL");
		System.out.println(al); // [A, C, 10, CG, null, Sandal, PYL, sg, M, C]
		
		System.out.println("Index of CG : "+al.indexOf("CG")); // 3
		
		al.add("CG");
		System.out.println(al); // [A, C, 10, CG, null, Sandal, PYL, sg, M, C, CG]
		
		System.out.println("Last index of CG : "+al.lastIndexOf("CG"));  // 10
		
		System.out.println("Size of arrayList : "+al.size());  // 11
		
		Object[] o = al.toArray();
		for(Object tmp : o)
		{
			System.out.println(tmp);
		}
		System.out.println("------------------");
		
		al.retainAll(al1);  // remove al elements exapt duplicates of al
		System.out.println(al); // [C, sg, M, C]
		
	//	al.removeAll(al1);  //  remove al1 elements exapt duplicates of al1
	//	System.out.println(al);  // [A, 10, CG, null, Sandal, PYL, CG]
	
		al.clear();
		System.out.println(al); // []
	}
}