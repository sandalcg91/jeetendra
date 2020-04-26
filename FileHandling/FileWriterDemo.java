import java.io.*;
import java.lang.*;
class FileWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("cg.txt");
		fw.write(200);
		fw.write(100);
		fw.write("Chandan is a honext men");
		char[] ch = {'A','C','F'};
		fw.write('\n');
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
	}
}