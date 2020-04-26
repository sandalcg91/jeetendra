
// Method Overloading

class MethodOver
{
	void m(int i){
			System.out.println("int Variable");
	}
/*	void m(String s)
	{
		System.out.println("String Variable");
	}
	void m(Object o)
	{
		System.out.println("Object Variable");
	}
	void m(StringBuffer sb)
	{
		System.out.println("SB Variable");
	}
*/	
	public static void main(String[] args)
	{
		MethodOver mo = new MethodOver();
/*		mo.m("Hello");
		mo.m(new Object());
		mo.m(new StringBuffer());
		mo.m(null);    // ambiguous error
*/
		mo.m(10);
		mo.m('a');
		}
}