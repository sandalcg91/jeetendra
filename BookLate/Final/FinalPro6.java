class FinalPro6
{
	public static void main(String[] args)
	{
		final int a[] = new int[2];
		int b[] = new int[5];
		b = a;
		
		final int x[] = new int[9];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		x[0] = 30;
		x[1] = 40;  // member of final array can be reinitialized
		
		//int x[] = new int[3]; // but variable can't
		
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}