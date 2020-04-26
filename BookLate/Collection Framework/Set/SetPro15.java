import java.util.*;
class Employee
{
	String empName;
	int empid;
	int salary;
	Employee(int empid, String empName, int salary)
	{
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
	public String toString()
	{
		return "{"+empid+","+empName+","+salary+"}";
	}
	
	static class SortBasedOnName implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			
			return e1.empName.compareTo(e2.empName);
		}
	}

	static class SortBasedOnId implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			
			return e1.empid-(e2.empid);
		}
	}
	
	static class SortBasedOnSalary implements Comparator
	{
		public int compare(Object o1, Object o2)
		{
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			
			return e1.salary-(e2.salary);
		}
	}
}
class O
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(100,"chandan", 1000);
		Employee e2 = new Employee(600,"manish", 7000);
		Employee e3 = new Employee(400,"payal", 3400);
		Employee e4 = new Employee(200,"sandal", 8300);
		Employee e5 = new Employee(300,"gupta", 6500);
		
		TreeSet t = new TreeSet(new Employee.SortBasedOnId());
		TreeSet t1 = new TreeSet(new Employee.SortBasedOnName());
		TreeSet t2 = new TreeSet(new Employee.SortBasedOnSalary());

		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		// Based on D N S O
		System.out.println("SortBasedOnId");
		System.out.println("--------------");
		System.out.println(t);
		System.out.println("--------------");
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		
		System.out.println("SortBasedOnName");
		System.out.println("--------------");
		System.out.println(t1);
		System.out.println("--------------");
		
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		
		System.out.println("SortBasedOnSalary");
		System.out.println("--------------");
		System.out.println(t2);
		System.out.println("--------------");
	}
}