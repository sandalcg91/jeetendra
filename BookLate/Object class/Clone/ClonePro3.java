class Duplicate
{
	int j;
}
class D implements Cloneable
{
	int i = 80;
	Duplicate d;
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		D d1 = new D();
		d1.i = 90;
		D d2 = (D)d1.clone();
		
		System.out.println(d1.i);
		System.out.println(d2.i);
		d2.i = 100;
		System.out.println(d1.i);
		System.out.println(d2.i);
	}
}