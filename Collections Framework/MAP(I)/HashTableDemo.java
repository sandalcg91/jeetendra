import java.util.*;
public class HashTableDemo
{
	public static void main(String[] args)
	{
		Hashtable t = new Hashtable();
		t.put(new Temp1(5),"A");
		t.put(new Temp1(2),"B");
		t.put(new Temp1(6),"C");
		t.put(new Temp1(15),"D");
		t.put(new Temp1(23),"E");
		t.put(new Temp1(16),"F");

	//	t.put("sandal", null); // NPE
		System.out.println(t);
	}
}
class Temp1
{
	int i;
	Temp1(int i)
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+ " ";
	}
}