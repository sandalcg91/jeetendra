import java.util.*;
class Exep7
{
    public static void main(String[] args)
    {  
        Scanner s=new Scanner(System.in);  
        System.out.println("provide the division value");  
        int n=s.nextInt();   
        try
		{
			System.out.println(10/n);   
        }
		catch(ArithmeticException ae)
		{
			System.out.println(10/2);
			try
			{
				String str="Chandan";
				//String str=null;
				System.out.println("u r name is :"+str);      
				System.out.println("your name length is "+str.length());
			}
			catch(NullPointerException npe)
			{
				System.out.println("getting Exception " +npe);
			}
		}
	}
}