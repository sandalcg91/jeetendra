package p1;
public class PackageProg
{
	int empno;
	String name;
	
	public void setData(int eno, String nm)       // All method must be public 
	{
		empno = eno;
		name = nm;
	}
	public void getData()
	{
		System.out.println("Employee No   : "+empno);
		System.out.println("Employee name : "+name);
	}
}