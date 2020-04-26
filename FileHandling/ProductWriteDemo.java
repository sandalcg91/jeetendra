import java.io.*;
class ProductWriteDemo
{
	public static void main(String[] args)
	{
		try
		{
			// create Stream Objects
			FileOutputStream fos = new FileOutputStream("payal.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// perform serialization
			Product p = new Product(11,"I-phoneX", 2);
			oos.writeObject(p);
			fos.close();
			oos.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}