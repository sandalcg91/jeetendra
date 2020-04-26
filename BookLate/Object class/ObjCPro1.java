class A1
{
	int i,j;
	A1(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		
		int i1 = s1.hashCode();
		int i2 = s2.hashCode();
		System.out.println(i1);
		System.out.println(i2);
		
		return s1.hashCode()+s2.hashCode();
	}
	public String toString()
	{
		return "i= " +i + "," + " j= " +j;
	}
}
class A
{
	public static void main(String[] args)
	{
		A1 a = new A1(12,10);
		A1 a1 = new A1(10,12);
		
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		
		System.out.println(a);
		System.out.println(a1);
		
		System.out.println(a.toString());		
		System.out.println(a1.toString());
		
		System.out.println(a.equals(a1));		
	}
}