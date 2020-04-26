class EmpEquOverride1
{
	int eid;
	String ename;
	
	EmpEquOverride1(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
	
	public boolean equals(Object o)
	{
		try
		{
			EmpEquOverride1 e2 = (EmpEquOverride1) o;
			if(eid == e2.eid && ename.equals(e2.ename))
				return true;
			else
				return false;
		}
		catch(ClassCastException cce)
		{
			System.out.println("Objects Belongs to diffrent Classes");
			return false;
		}
		catch(NullPointerException npe)
		{
			System.out.println("Objects Can't compared");
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		EmpEquOverride1 e = new EmpEquOverride1(111, "Chandan");
		EmpEquOverride1 e1 = new EmpEquOverride1(111, "Chandan");
		System.out.println(e.equals(e1));  // true

		EmpEquOverride1 e2 = new EmpEquOverride1(112, "Chandan");
		System.out.println(e.equals(e2));  // false
		
		System.out.println(e.equals(null));  // false  Objects cannot compared
		
	    Employee3 ee = new Employee3(11, "manish");  // object belongs to diffrent classes   
		System.out.println(e.equals(ee));			 // false
		
		System.out.println(e.equals("Chandan"));  // false , object belongs to diffrent classes
	}
}
