import java.util.*;
import java.io.*;
class BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("sandal.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(123);
		bw.newLine();
		char[] ch = {'A','F','D','S'};
		bw.write(ch);
		bw.newLine();
		bw.write("chandan");
		bw.newLine();
		bw.write("payal");
		bw.flush();
		bw.close();
	}
}