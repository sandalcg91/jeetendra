
// super keyword must required

class Parent1
{
	int a = 10;
	int b = 20;
}
class Child1 extends Parent1
{
	int a = 100;
	int b = 200;
	
	void Add(int a, int b)
	{
		System.out.println(a+b);             // parameters
		System.out.println(this.a+this.b);   // current/Child/Sub class instance variable
		System.out.println(super.a+super.b); // Super/parent class Instance variable
	}
	
	public static void main(String[] args)
	{
		Child1 c1 = new Child1();
		c1.Add(1000,2000);
	}
}