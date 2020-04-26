import java.util.*;
class Employee
{
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return id+"  "+name;
	}
	
	public boolean equals(Object o)
	{
		Employee e = (Employee)o;
		if(e.getId()==this.id && e.getName().equals(this.name))
		{
			return true;
		}else{
			return false;
		}
	}
	
	public int hashCode()
	{
		int i = 3;
		i = 2*i+this.name.hashCode();
		return i;
	}
}
class SetEmployee
{
	public static void main(String... args)
	{
		Set s = new HashSet();
		s.add(new Employee(100, "chandan"));
		s.add(new Employee(101, "gupta"));
		s.add(new Employee(102, "gupta"));
		s.add(new Employee(100, "chandan"));
		System.out.println(s);
	}
}