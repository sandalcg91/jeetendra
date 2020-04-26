class InstanceBlock1
{
	int i = m1();
	int m1()
	{
   	    System.out.println("m1 instance method");
		return 10;
	}
	{
	 System.out.println("Instance Block " +i);
	}
	{
		System.out.println("Other Instance Block");
	}
	 
	public static void main(String[] args)
	{
		InstanceBlock1 ib = new InstanceBlock1();
		System.out.println("Instance Variable value " +ib.i);
	}
}
 
/*
output :
	m1 instance method
    Instance Block 10
	Other Instance Block
	Instance Variable value 10
*/
 