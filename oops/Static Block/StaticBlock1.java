class StaticBlock1
{
	//static int a=20;
	static  
	{
		System.out.println("Hello from 1st static Block");   
		System.out.println("Hello 1   "+a); 
		//System.exit(0);  
	}
	public static void main(String[] a)
	{
		System.out.println("Hello from main");
	}
	static
	{
		System.out.println("HI from Second Static Block");   
        //System.out.println("HI 1"); 
        //System.exit(0);  
	}
}
/*cmd
output :
	Hello from 1st static Block
	Hello 1   20
	HI from Second Static Block
	Hello from main
*/