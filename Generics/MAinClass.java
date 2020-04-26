import java.util.*;
class GenericClass<T>
{
	T ob;
	GenericClass(T o)
	{
		ob = o;
	}
	
	T getOb()
	{
		return ob;
	}
	
	void ShowType()
	{
		System.out.println("Type of T is : "+ob.getClass().getName());
	}
}
public class MAinClass
{
	public static void main(String[] args)
	{
		// create a generic reference for Integers.
		GenericClass<Integer> iOb = new GenericClass<Integer>(13);
		iOb.ShowType();
		
		// no cast is needed
		int v = iOb.getOb();
		System.out.println("value : "+v);
		
		// create a generic reference for Strings.
		GenericClass<String> strOb = new GenericClass<String>("chandan");
		strOb.ShowType();
		
		// no cast needed
		String s = strOb.getOb();
		System.out.println("value : "+s);
		
		// create a generic reference for another class.
		GenericClass<GenericDemo> cOb = new GenericClass<GenericDemo>(new GenericDemo());
		cOb.ShowType();
		
		// no cast needed
		GenericDemo gd = cOb.getOb();
		System.out.println("value : "+gd);
	}
}