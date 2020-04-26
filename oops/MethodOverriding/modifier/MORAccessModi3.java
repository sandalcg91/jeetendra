
//      Private/ Default/ Protected/ Public

class Parent
{
	public Object m()                  // Public
	{
		System.out.println("Object Return type");
	    return 0;
	}
}
class Child extends Parent
{
	public String m()           // public
	{
		String mm = "Chandan";
		System.out.println("Object/String/Employee return type");
	return mm;
	}
}
class MORAccessModi3
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		System.out.println(p.m());
		
		Child c = new Child();
		System.out.println(c.m());
		
		Parent p1 = new Parent();
		System.out.println(p1.m());  // Child class reference method will print
	}
}