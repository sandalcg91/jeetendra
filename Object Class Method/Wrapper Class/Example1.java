class Example1
{
	static Integer I = 10;  //  AB
	
	public static void main(String[] args)
	{
		int i = I;   // AUB
		m1(i);
	}
	public static void m1(Integer I)   // AB
	{
		int k = I;   //  AUB
		System.out.println(k);
	}
}
class BoxAndUnboxing211
{
	static Integer I;  //Autoboxing             
	public static void main(String[] str)
	{ 
		int m=I;
		System.out.println(m);
	}
}