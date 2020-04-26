class FinalPro4
{
	public static void main(String[] args)
	{
		final int i;
		int j = 10;
		i = j;
		int k = i+j;
		k++;
		System.out.println(i); // 10
		System.out.println(j); // 10
		System.out.println(k); // 21
	}
}