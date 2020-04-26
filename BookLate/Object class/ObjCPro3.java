class ObjCPro3
{
	int i;
	ObjCPro3(int i)
	{
		this.i = i;
	}
	/*
	public boolean equals(Object o)
	{
		ObjCPro3 op3 = (ObjCPro3)o;
		return this == op3;
	}*/
	public String toString()
	{
		return "i= " +i;
	}
	
	public static void main(String[] args)
	{
		ObjCPro3 op = new ObjCPro3(10);
		ObjCPro3 op1 = new ObjCPro3(10);
		ObjCPro3 op2 = op1;
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(op==op1);
		System.out.println(op.equals(op1));
		
		System.out.println(op1==op2);
		System.out.println(op1.equals(op2));
		
		System.out.println(op);
		System.out.println(op1);
	}
}