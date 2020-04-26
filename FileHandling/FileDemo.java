import java.io.*;
import java.lang.*;
class FileDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("abcd.txt");
		f.createNewFile();
		
		System.out.println(f.exists());
		
		File f1 = new File("Chandan");
		f1.mkdir();
	}
}