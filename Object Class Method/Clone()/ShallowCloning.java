class A
{
	int a;
	A(int i)
	{
		a=i;
	}
}
class B implements Cloneable
{
	A obA;
	int b;
	B(A r, int j)
	{
		obA = r;
		b = j;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class ShallowCloning
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		A x = new A(11);
		B y = new B(x, 12);
		B y1 = (B)y.clone();
		
		System.out.println(y1.b +" " +y1.obA.a);
		//System.out.println(y.b +" " +y.obA.a);
	
		y1.b = 20;
		y1.obA.a = 30;
		System.out.println(y1.b +" " +y1.obA.a);
		System.out.println(y.b +" " +y.obA.a);
		
		System.out.println(y.obA.hashCode());
		System.out.println(y1.obA.hashCode());
	}
}