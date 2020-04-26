
// Object-Graph in serialization

import java.io.*;
class Dogg implements Serializable
{
	Cat c = new Cat();
}
class Cat implements Serializable
{
	Rat r = new Rat();
}
class Rat implements Serializable
{
	int j = 20;
}
class DCRSerialization
{
	public static void main(String[] args) throws Exception
	{
		Dogg dg = new Dogg();
		FileOutputStream fos = new FileOutputStream("DCR.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dg);
		
		FileInputStream fis = new FileInputStream("DCR.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dogg dg1 = (Dogg)ois.readObject();
		System.out.println(dg1.c.r.j);
	}
}