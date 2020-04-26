import java.util.*;
class GenericClass<T extends Number, X extends Number>
{
	T ob1, ob2;
	
	GenericClass(T o1, T o2)
	{
		ob1 = o1;
		ob2 = o2;
	}
	
	void arithmeticOperation()
	{
		System.out.println(ob1.intValue()+ob2.intValue());
		System.out.println(ob1.intValue()-ob2.intValue());
	}
}
class BoundedParameter
{
	public static void main(String[] arg)
	{
		// create generic reference for Integer
		GenericClass<Integer, Integer> iOb = new GenericClass<Integer, Integer>(53,34);
		iOb.arithmeticOperation();
		
		// create generic reference for Float
		GenericClass<Float, Float> fOb = new GenericClass<Float, Float>(54.5f,34.4f);
		fOb.arithmeticOperation();
		
		// create generic reference for String
	//	GenericClass<String,String> strOb = new GenericClass<String, String>("ab", "ab");
	//	strOb.arithmeticOperation();
	}
}