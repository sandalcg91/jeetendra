class Eeg
{
	int i;
	static int j;
	void test()
	{
		System.out.println(i);
	}
	static void test1()
	{
		System.out.println(j);
	}
}
class E
{
	public static void main(String[] args)
	{
		Eeg e1 = new Eeg();
		System.out.println(e1.i);
		e1.test();
		Eeg.test1();
	}
}