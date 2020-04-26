class Student
{
	int sid;
	String sname;
	
	Student(int sid, String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
	
	public static void main(String[] args)
	{
		Student s = new Student(111, "Chandan");
		Student s1 = new Student(112, "Sandal");
		System.out.println(s);
		System.out.println("S : " +s.toString());
		System.out.println("s1 : " +s1.toString());

		System.out.println(s==s1);
		s=s1;
		
		System.out.println("S : " +s.toString());
		System.out.println("s1 : " +s1.toString());
		
		System.out.println(s==s1);
	}
}