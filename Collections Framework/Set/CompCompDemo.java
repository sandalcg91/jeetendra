import java.util.*;
class Employee implements Comparable
{
	int eid;
	String name;
	Employee(int eid, String name)
	{
		this.eid = eid;
		this.name = name;
	}
	public String toString()
	{
		return name+ "----" +eid;
	}
	public int compareTo(Object o)
	{
		int eid1 = this.eid;
		Employee e = (Employee)o;
		int eid2 = e.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		else if(eid1>eid2)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
}
class CompCompDemo
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(100,"chandan");
		Employee e2 = new Employee(600,"Manish");
		Employee e3 = new Employee(400,"Payal");
		Employee e4 = new Employee(200,"Sandal");
		Employee e5 = new Employee(300,"Gupta");
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		return e2.compareTo(e1);
	}
}