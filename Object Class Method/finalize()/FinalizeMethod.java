class FinalizeMethod
{
	public static void main(String[] args)
	{
		Temp t = new Temp();
		System.out.println(t);
		t = null;
		System.gc();
		System.out.println(t);
	}
}
class Temp
{
	public String toString()
	{
		return "Temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}