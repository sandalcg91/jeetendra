import java.io.*;
class TryWithResources1
{
	public static void main(String[] args)
	{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt")))
		{
			bw.write("Chandan  ");
			bw.write(100);
		}
		catch(IOException e)
		{
			System.out.println("Getting Exception " +e);
		}
	}
}