interface E
{}
interface F
{}
class A
{
	
}
class B
{
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof Object);
	}
}
class C extends A implements F,E
{
	public static void main(String[] args)
	{
		C c = new C();
		System.out.println(c instanceof Object);
		System.out.println(c instanceof A);
		System.out.println(c instanceof C);
		//System.out.println(c instanceof B);  C cant not be converted to B
		System.out.println(c instanceof E);
		System.out.println(c instanceof F);
	}
}