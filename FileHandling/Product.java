import java.io.*;
class Product implements Serializable
{
	int pid;
	String pname;
	int pqty;
				
		Product()
		{
			System.out.println(")-argument Constructor");
		}
		Product(int x, String y, int z)
		{
			pid = x;
			pname = y;
			pqty = z;
		}
		public void display()
		{
			System.out.println("Pid : "+pid + "Pname : "+pname+ "Pquantity :" +pqty);
		}
}