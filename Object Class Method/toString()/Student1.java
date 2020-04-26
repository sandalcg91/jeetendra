class Student1
{
	int sid;
	String sname;
	
	Student1(int sid, String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
	public String toString()
	{
		return "Sid : " +sid+ ", Sname : " +sname;
	//	return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
	public static void main(String[] args)
	{
		Student1 s1 = new Student1(11, "Chandan");
		
		System.out.println(s1);    // toString() method of our Customized Class(Student1) internaly invoked
		System.out.println(s1.toString());
	}
}