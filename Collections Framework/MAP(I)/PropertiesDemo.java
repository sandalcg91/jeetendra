import java.util.*;
import java.io.*;
class PropertiesDemo
{
	public static void main(String[] args) throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("xyz.txt");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("user");
		System.out.println(s);
		p.setProperty("pwd", "123456789");
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		p.store(fos, "Updated by sandal for Learning");
		
		Enumeration e = p.elements();
		while(e.hasMoreElements())
		{
			String o = (String)e.nextElement();
			System.out.println(o);
		}
	}
}