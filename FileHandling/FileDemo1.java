import java.io.*;
import java.lang.*;
class FileDemo1
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("Sandal");
		f.mkdir();
		
		System.out.println(f.exists());
		
		File f1 = new File(f,"xyz.pdf");
		f1.createNewFile();
		
		System.out.println(f1.isFile());
		System.out.println(f.isDirectory());
	}
}