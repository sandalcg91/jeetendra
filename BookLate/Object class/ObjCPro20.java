class T
{
	public int hashCode()
	{
		int i,j,k;
		i=90;
		j=80;
		k=i+j;
		return k;
	}
	
	public static void main(String[] args)
	{
		T t = new T();

		System.out.println(t.hashCode());
		System.out.println("------------------");
		System.out.println(t.toString());
	}
}