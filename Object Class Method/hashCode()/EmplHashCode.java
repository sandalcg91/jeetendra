class EmplHashCode
{
	int eid;
	String ename;
	
	EmplHashCode(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
	
	public static void main(String[] args)
	{
		EmplHashCode e = new EmplHashCode(12, "Sandal");
		EmplHashCode e1 = new EmplHashCode(13, "chandan");

		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(Integer.toHexString(e.hashCode()));
		System.out.println(e);
	}
}