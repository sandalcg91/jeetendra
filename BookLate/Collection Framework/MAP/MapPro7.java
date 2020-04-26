import java.util.*;
class G2
{
	int i;
	G2(int i)
	{
		this.i =i;
	}
	public String toString()
	{
		return "" +i;
	}
}
class G
{
	public static void main(String[] args)
	{
		Hashtable t = new Hashtable();
		t.put(10, "xyz");
		t.put(10, "abc");
		
		t.put("k1", 200);
		t.put("k1", 300);

		t.put(new G2(10), 10);
		t.put(new G2(10), 20);
		
		System.out.println(t);
	}
}