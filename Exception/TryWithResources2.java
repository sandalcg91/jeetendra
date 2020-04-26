import java.io.*;
class TryWithResources2
{
	public static void main(String[] args)
	{
		try(FileReader fr = new FileReader("a.txt"); BufferedReader br = new BufferedReader(fr))
		{
			int a = br.read();
			while(a!=-1)
			{
				System.out.print((char)a);
				a = br.read();
			}
		}
		catch(IOException e)
		{
			System.out.println("Getting Exception " +e);
		}
	}
}