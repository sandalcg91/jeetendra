import java.util.*;
import java.io.*;
class BufferReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("sandal.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}