class EmplHashCodeOverride
{
	int eid;
	String ename;
	
	EmplHashCodeOverride(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}
	/*                      Not Proper Overriding
	public int hashCode()
	{
		return 100;
	}*/
	
	public static void main(String[] args)
	{
		EmplHashCodeOverride e = new EmplHashCodeOverride(12, "Sandal");
		EmplHashCodeOverride e1 = new EmplHashCodeOverride(13, "chandan");
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e);
		System.out.println(e1);
	}
	
	public String toString()
	{
		return "Eid : " +eid+ ", Ename : " +ename;
	}
	
	public int hashCode()  // Proper Overriding
	{
		return eid;
	}
}