import java.util.*;
class TwoGeneric<T, V>
{
	T ob1;
	V ob2;
	TwoGeneric(T o1, V o2)
	{
		ob1 = o1;
		ob2 = o2;
	}
	
	T getOb1()
	{
		return ob1;
	}
	V getOb2()
	{
		return ob2;
	}
	
	void ShowType()
	{
		System.out.println("Type of T is : "+ob1.getClass().getName());
		System.out.println("Type of V is : "+ob2.getClass().getName());
	}
}
public class MAinClass1
{
	public static void main(String[] args)
	{
		// create a generic reference for Integers and String.
		TwoGeneric<Integer, String> twoOb = new TwoGeneric<Integer, String>(13, "chandan");
		twoOb.ShowType();
		
		// no cast is needed
		int v = twoOb.getOb1();
		System.out.println("value : "+v);
		
		// no cast needed
		String s = twoOb.getOb2();
		System.out.println("value : "+s);
	}
}