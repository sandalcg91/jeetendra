import java.io.*;
class Dog implements Serializable
{
	int i = 10;
	int j = 20;
}
class DogSerializationDemo
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Dog d = new Dog();
		FileOutputStream fos = new FileOutputStream("Dog.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis = new FileInputStream("Dog.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println(d2.i+"----------"+d2.j);
	}
}