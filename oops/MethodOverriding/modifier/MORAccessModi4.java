
//      Private/ Default/ Protected/ Public

class Parent
{
	private Object m()                  // Private
	{
		System.out.println("Object Return type");
	    return 0;
	}
}
class Child extends Parent
{
	public String m()           // public/privateted       chile ic method    overridden concept not applicable..
	{
		String mm = "Chandan";
		System.out.println("Object/String/Employee return type");
	return mm;
	}
}
class MORAccessModi4
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