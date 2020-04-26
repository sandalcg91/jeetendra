
//      Private/ Default/ Protected/ Public

class Parent
{
	Object m()                  // Non Final / abstract / synchronized / native
	{
		System.out.println("Object Return type");
	    return 0;
	}
}
class Child extends Parent
{
	final String m()           // Final / non-abstract / non-synchronized / non-native
	{
		String mm = "Chandan";
		System.out.println("Object/String/Employee return type");
	return mm;
	}
}
class MORNonAccessModi
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		//System.out.println(p.m());
		
		Child c = new Child();
		System.out.println(c.m());
		
		Parent p1 = new Parent();
		//System.out.println(p1.m());  // Child class reference method will print
	}
}