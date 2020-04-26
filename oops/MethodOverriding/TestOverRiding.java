class Parent
{
	void m()
	{}
}
class Child extends Parent
{
	void m1()
	{}
	void m()
	{}
}
class TestOverRiding
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.m();     
		//p.m1();
		
		Child c =  new Child();
		c.m();   // Child class refference variable reffer child class Object...    child method will execute
		c.m1();
		
		Parent p1 = new Child();
		p1.m();   // Parent class reference with child class object...    child method will execute
		//p1.m1();
	}
}