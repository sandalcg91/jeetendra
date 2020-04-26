import java.io.*;
import java.lang.*;
class FileListDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\");
		String[] s = f.list();
		for(String s1 : s)
		{
			System.out.println(s1);
		}
	}
}