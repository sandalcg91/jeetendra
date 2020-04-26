class EmpEquOverride2
{
	int eid;
	String ename;
	
	EmpEquOverride2(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)  // if both the reference variable point to same objects, then no need of comparision
			return true;
		else if(o instanceof EmpEquOverride2)
		{
			EmpEquOverride2 e2 = (EmpEquOverride2) o;
			if(eid == e2.eid && ename.equals(e2.ename))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		EmpEquOverride1 e = new EmpEquOverride1(111, "Chandan");
		EmpEquOverride1 e1 = new EmpEquOverride1(111, "Chandan");
		System.out.println(e.equals(e1));  // true

		EmpEquOverride1 e2 = e1;
		System.out.println(e.equals(e2));  // true
		
		System.out.println(e1.equals(e2));  // true
		
	    Employee3 ee = new Employee3(11, "manish");  // object belongs to diffrent classes   
		System.out.println(e.equals(ee));			 // false
		
		System.out.println(e.equals("Chandan"));  // false , object belongs to diffrent classes
	}
}