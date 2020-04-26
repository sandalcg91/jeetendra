public class PrimeNoWithRange

{
	
	public static void primeWithRange(int first, int last)
	
	{	

		
		int n = 2;
		
		int sum = 0;
		
		for(int i = first; i<=last; i++)
		
		{
			
			int count = 0;
			
			for(int j=1; j<=n; j++)
			
			if(n%j==0)
			
			count++;

			
			if(count ==2)
			
			{
				
				System.out.print(n+ " ");			
				sum = sum + n;
		
			}
		
			n++;
		
		}
		
		System.out.print("\n");
	//		
		System.out.print("Sum of Prime Numbers : "+sum);
			
		System.out.print("\n"); 
	
	}
	
	public static void main(String[] args) 
	{
		
		PrimeNoWithRange.primeWithRange(2,100);
	
	}

}