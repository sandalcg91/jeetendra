package p2;
import p1.A;
public class X
{
	public static void main(String[] args)
	{
		A a1 = new A();
		//System.out.println("private variable of class A : "+a1.c);
		//System.out.println("Default variable of class A : "+a1.a);
		System.out.println("public variable of class A : "+a1.b);
		//System.out.println("protected variable of class A : "+a1.d);
		a1.m();
	}
}
class Y extends A
{
	public static void main(String[] args)
	{
		Y y = new Y();
		System.out.println("Public variable of class A : "+y.b);
		System.out.println("Protected variable of class A : "+y.d);
	}
}