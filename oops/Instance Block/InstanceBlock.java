class InstanceBlock
{
	InstanceBlock()
    {
    	 System.out.println("Contructor");
	}
	{
	     System.out.println("Instance Block 1");
	}
	 
	 InstanceBlock(int a)
	 {
		 System.out.println("Constructor 1");
	 }
	 
	 public static void main(String[] args)
	 {
		 InstanceBlock ib = new InstanceBlock();
		 InstanceBlock ib1 = new InstanceBlock(10);
	 }
	 {
		 System.out.println("Instance Block 2");
	 }
 }
 
 /*
 output :
 Instance Block1
 Instance Block2
 Constructor
 Instance Block1
 Instance Block2
 Constructor1
 */
 