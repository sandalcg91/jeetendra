class ObjCPro2
{
	int i;
	ObjCPro2(int i)
	{
		this.i = i;
	}
	
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return "i= " +i;
	}
	
	public static void main(String[] args)
	{
		ObjCPro2 op = new ObjCPro2(10);
		ObjCPro2 op1 = new ObjCPro2(20);
		ObjCPro2 op2 = op1;
		
		System.out.println(op);
		System.out.println(op.hashCode());
		
		System.out.println(op1);
		System.out.println(op1.hashCode());
		
		System.out.println(op2);
		System.out.println(op2.hashCode());
	}
}