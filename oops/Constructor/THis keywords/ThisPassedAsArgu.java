
// this keyword can be passed as as argument in the method

class ThisPassedAsArgu
{
	void m(ThisPassedAsArgu o)
	{
		System.out.println("Hello");
	}
	void p()
	{
		m(this);
	}
	
	public static void main(String[] args)
	{
		ThisPassedAsArgu t = new ThisPassedAsArgu();
		t.p();
	}
}