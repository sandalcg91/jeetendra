import java.io.*;
class Animal
{
	int i = 10;
	Animal()
	{
		System.out.println("Animal Constructor called");
	}
}
class Dog extends Animal implements Serializable
{
	int j = 20;
	Dog()
	{
		System.out.println("Dog Constructor called");
	}
}
class ADDemo
{
	public static void main(String[] args) throws Exception
	{
		Dog d = new Dog();
		d.i = 1000;
		d.j = 2000;
		
		FileOutputStream fos = new FileOutputStream("Animal.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		System.out.println("Deserialization started");
		
		FileInputStream fis = new FileInputStream("Animal.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		System.out.println(d1.i+"------"+d1.j);
	}
}