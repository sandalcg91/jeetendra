class SIB2
{
	static
	{
		System.out.println("SIB2 Parent");
	}
	public static void main(String[] args)
	{
		System.out.println("main Parent");
	}
}
class STB2_Child
{
	static
	{
		System.out.println("STB2_Child");
	}
}
class STB2_ChildExt extends STB2_Child
{
	static
	{
		System.out.println("STB2_ChildExt");
	}
}