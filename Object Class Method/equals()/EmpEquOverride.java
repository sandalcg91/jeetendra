class EmpEquOverride
{
	int eid;
	String ename;
	
	EmpEquOverride(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
	
	public boolean equals(Object o) // e1
	{
		int Eid = this.eid; // 111
		String Ename = this.ename; // Chandan
		
		EmpEquOverride e2 = (EmpEquOverride) o;
		int Eid1 = e2.eid; // 111
		String Ename1 = e2.ename; // Chandan
		
		if(Eid == Eid1 && Ename.equals(Ename1))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		EmpEquOverride e1 = new EmpEquOverride(111, "Chandan");
		EmpEquOverride e2 = new EmpEquOverride(111, "Chandan");
		System.out.println(e1.equals(e2));  // true

		EmpEquOverride e3 = new EmpEquOverride(112, "Chandan");
		System.out.println(e1.equals(e3));  // false
		
		//System.out.println(e.equals(null));  // NullPointerException
		
	    //Employee3 ee = new Employee3(11, "manish");   ClassCastException
		//System.out.println(e.equals(ee));             Employee3 cannot be cast to EmpEquOverride
		
		//System.out.println(e.equals("Chandan"));  ClassCastException..  String cannot be cast to EmpEquOverride
	}
}
