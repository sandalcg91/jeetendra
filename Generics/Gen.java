import java.util.*;
class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob = ob;
	}
	public void show()
	{
		System.out.println("the type of ob is : "+ob.getClass().getName());
	}
	public T getOb()
	{
		return ob;
	}
}
class GenDemo
{
	public static void main(String[] args)
	{
		Gen<String> g = new Gen<String>("chandan");
		g.show();
		System.out.println(g.getOb());

		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getOb());
	}
}