
// Try without catch posible

import java.io.*;
class TryWithResources5
{
	public static void main(String[] args) throws IOException
	{
		try(BufferedReader br = new BufferedReader(new FileReader("a.txt")))
		{
			String s = br.readLine();
			while(s!=null)
			{
				System.out.print(s);
				s = br.readLine();
			}
		}
	}
}