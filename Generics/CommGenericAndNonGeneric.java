import java.util.*;
class CommGenericAndNonGeneric
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("M");
		al.add("M1");
	//	al.add(12);
		
		method(al);
		System.out.println(al);
	//	al.add(4.5);
	//	System.out.println(al);
	}

	public static void method(ArrayList al1)
	{
		al1.add(12);
		al1.add(12.5);
		al1.add(true);
	}
}