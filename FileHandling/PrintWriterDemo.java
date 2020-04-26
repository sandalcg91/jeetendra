import java.util.*;
import java.io.*;
class PrintWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("sandal1.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.write(100);
		pw.write(200);
		pw.println(100);
		pw.println(200);
		pw.println(true);
		pw.println('c');
		pw.println("chandan");
		pw.flush();
		pw.close();
	}
}