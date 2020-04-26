import java.util.*;
import java.io.*;
class Account implements Serializable
{
	String username = "chandan";
	transient String password = "sandal";
	
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.defaultWriteObject();
		String epwd = (String);
	}
}
class AccOverrideMethodDemo
{
	public static void main(String[] args) throws Exception
	{
		Account a1 = new Account();
		System.out.println(a1.username + "-------"+ a1.password);
		FileOutputStream fos = new FileOutputStream("Acc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("Acc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();
		System.out.println(a2.username + "-------"+ a2.password);
	}
}