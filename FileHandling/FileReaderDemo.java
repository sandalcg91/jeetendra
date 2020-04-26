import java.util.*;
import java.io.*;
class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("cg.txt");
		int i = fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = fr.read();
		}
		
		File f = new File("cg.txt");
		FileReader fr1 = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		fr1.read(ch);
		for(char ch1 : ch)
		{
			System.out.print(ch1);
		}
	}
}