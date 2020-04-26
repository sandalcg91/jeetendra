import java.util.*;
class Exep6
{
    public static void main(String[] args)
    {  
        try
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
				System.out.println("getting Exception " +ae);
			}
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
		catch(Exception e)
		{
			System.out.println("getting Exception " +e);
		}
	}
}