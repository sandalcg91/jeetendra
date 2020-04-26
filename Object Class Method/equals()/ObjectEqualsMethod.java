class ObjectEqualsMethod
{
	int eid;
	String ename;
	
	ObjectEqualsMethod(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
	
	public static void main(String[] args)
	{
		ObjectEqualsMethod e = new ObjectEqualsMethod(111, "chandan");
		ObjectEqualsMethod e1 = new ObjectEqualsMethod(111, "chandan");
		
		System.out.println(e==e1);  // false - == to compare reference
		System.out.println(e.equals(e1)); // false -  to compare Object Content
		
		e=e1;
		System.out.println(e.equals(e1)); // true
		
		System.out.println(e.equals(null)); // false default value of reference is null
		
		ObjectEqualsMethod e2 = null;
		
		// System.out.println(null.equals(null));  error : can't be dereference
		
		// System.out.println(e2.equals(null)); NullPointerException : e2 is a reference not creating any object of e2
		
		System.out.println(null==null); // true both are same
		
		System.out.println(e2==null); // true e2 also a reference and default value of an reference is null
		
		Employee3 ee = new Employee3(11, "sandal");
		
		System.out.println(e.equals(ee)); // false
		
		System.out.println(e.equals("chandan")); // false
	}
}