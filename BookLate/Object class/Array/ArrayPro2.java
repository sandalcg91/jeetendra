public class ArrayPro2
{
	public static void main(String[] args)
	{
		int x[];
		x = new int[3];
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
}