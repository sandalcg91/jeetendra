class Animal
{
	
}
class Monkey extends Animal
{
	
}
class Test
{
	void m(Animal a)
	{
		System.out.println("Animal Variable");
	}
	void m(Monkey m)
	{
		System.out.println("Monkey Variable");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		
		Animal a1 = new Animal();
		t.m(a1);
		
		Monkey m1 = new Monkey();
		t.m(m1);
		
		Animal a2 = new Monkey(); // parent refference variable is holding child object
		t.m(a2);
	}
}