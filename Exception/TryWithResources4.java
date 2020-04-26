import java.io.*;
class TryWithResources4
{
	public static void main(String[] args)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("a.txt")))
		{
			//br = new BufferedReader(new FileReader("a.txt")); // auto-closeable resource br may not be assigned
															  // reassignment of reference variable of resource not possible
			String s = br.readLine();
			while(s!=null)
			{
				System.out.print(s);
				s = br.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println("Getting Exception " +e);
		}
	}
}