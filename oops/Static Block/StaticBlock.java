
// Static Block

class StaticBlock
{  
	static int a=20;
	static  
	{
		System.out.println("Hello");   
		System.out.println("Hello 1 "+a); 
		//System.exit(1);  
	} 

	public static void main(String[] args)
	{
		System.out.println("Hello 2");
	}

	static  
	{
		System.out.println("HI ");   
		System.out.println("HI 1"); 
        //System.exit(0);  
	}
}

/*
output :
	Hello
	Hello 1 20
	HI
	HI 1
	Hello 2
*/