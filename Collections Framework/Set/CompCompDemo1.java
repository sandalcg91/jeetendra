import java.util.*;
class Employee1 //implements Comparable
{
	int eid;
	String name;
	Employee1(int eid, String name)
	{
		this.eid = eid;
		this.name = name;
	}
	public String toString()
	{
		return name+ "----" +eid;
	}
/*	public int compareTo(Object o)
	{
		int eid1 = this.eid;
		Employee1 e = (Employee1)o;
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
	}*/
}
class CompCompDemo1
{
	public static void main(String[] args)
	{
		Employee1 e1 = new Employee1(100,"chandan");
		Employee1 e2 = new Employee1(600,"manish");
		Employee1 e3 = new Employee1(400,"payal");
		Employee1 e4 = new Employee1(200,"sandal");
		Employee1 e5 = new Employee1(300,"gupta");
		
		TreeSet t = new TreeSet(new MyComparator1());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
	}
}
class MyComparator1 implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee1 e1 = (Employee1)o1;
		Employee1 e2 = (Employee1)o2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return -s1.compareTo(s2);
	}
}