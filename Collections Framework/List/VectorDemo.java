import java.util.*;
public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		System.out.println(v.capacity()); // 10
		for(int i=1; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity()); // 10
		v.addElement("A"); 
		System.out.println(v.capacity()); // 20
		System.out.println(v);
		
		
		// to add objects
		v.add("c");
		v.add(2,"B");
		v.addElement("cg");
		System.out.println(v);
		
		// to remove objects
		v.remove("B");
		v.remove(3); // index
		v.removeElementAt(4);
		System.out.println(v);
	//	v.clear();
	//	System.out.println(v);
	//	v.removeAllElements();
	//	System.out.println(v); // []
		
		// to get an Object
		System.out.println(v.get(2));  // 3
		System.out.println(v.elementAt(3)); // 5
		System.out.println(v.firstElement()); // 1
		System.out.println(v.lastElement()); // cg
	
		// other
		System.out.println("Size of Vector : "+v.size()); // 11
		System.out.println("Capacity of Vector : "+v.capacity());  //20
	}
}