
// Static Block and Instance Block in Parent Child relationship

class ParentClass
{
	static
	{
		System.out.println("Parent class static block");
	}
	{
		System.out.println("Parent class Instance block");
	}
}
class ChildClass extends ParentClass
{
	static
	{
		System.out.println("Child class Static block");
	}
	{
		System.out.println("Child class Instance block 1");
	}
	{
		System.out.println("Child class Instance block 2");
	}
	ChildClass()
	{}
	ChildClass(int i)
	{
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		ChildClass cc = new ChildClass(11);
	}
}

/*
output :
	Parent class static block
	Child class Static block
	Parent class Instance block
	Child class Instance block 1
	Child class Instance block 2
	11
*/