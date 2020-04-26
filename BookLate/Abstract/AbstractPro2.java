abstract class Person
{
	void address()
	{
		System.out.println("Indore");
	}
	abstract void task();
}
class Emp extends Person
{
	void task()
	{
		System.out.println("Office");
	}
}
class Husband extends Person
{
	void task()
	{
		System.out.println("Kitchen");
	}
}
class B
{
	public static void main(String[] args)
	{
		Person p1 = new Emp();
		
		Person p2 = new Husband();
		
		p1.address();
		System.out.println("--------");
		
		p2.address();
		System.out.println("--------");
		
		p1.task();
		
		p2.task();
	}
}