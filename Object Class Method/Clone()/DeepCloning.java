class A1
{
	int a;
	A1(int i)
	{
		a=i;
	}
}
class B1 implements Cloneable
{
	A1 obA;
	int b;
	B1(A1 r, int j)
	{
		obA = r;
		b = j;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		A1 a1 = new A1(obA.a);
		B1 b1 = new B1(a1,b);
		return b1;
	}
}
class DeepCloning
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		A1 x = new A1(12);
		B1 y = new B1(x, 23);
		B1 y1 = (B1)y.clone();
		
		System.out.println(y1.b+ " " +y1.obA.a);
		System.out.println(y.b+ " " +y.obA.a);
		
		y1.b = 30;
		y1.obA.a = 40;
		
		System.out.println(y1.b+ " " +y1.obA.a);
		System.out.println(y.b+ " " +y.obA.a);
	}
}