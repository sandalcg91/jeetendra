import java.io.*;
class TryWithResources3
{
	public static void main(String[] args)
	{
		try(FileReader fr = new FileReader("a.txt"); BufferedReader br = new BufferedReader(fr))
		{
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