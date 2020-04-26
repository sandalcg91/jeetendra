class InstanceBlock2
{  
	int m1()  
	{ 
		System.out.println("m-1 instance method");   
		return 10; 
	}
	{
		System.out.println("instance Block  " );
	}

    int i=m1();

    public static void main(String[] args)  
    {
		InstanceBlock2 t=new InstanceBlock2();  
		System.out.println(t.i);
    } 
} 

/*
output :
	instance Block
	m-1 instance method
	10
*/