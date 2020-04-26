
// Super keyword is not required

class Parent
{
	int x = 10;
	int y = 20;
}
class Child extends Parent
{
	int a = 100;
	int b = 300;
	
	void Add(int i, int j)
	{
		System.out.println(i+j);
		System.out.println(a+b);
		System.out.println(x+y);
	}
	
	public static void main(String[] args)
	{
		Child c = new Child();
		c.Add(1000,3000);
	}
}