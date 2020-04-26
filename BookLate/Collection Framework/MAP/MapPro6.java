import java.util.*;
class F
{
	public static void main(String[] args)
	{
		Hashtable t = new Hashtable();
		t.put("k1", "v1");
		t.put("k2", "v2");
		t.put("k3", "v3");
		t.put("k4", "v4");
		t.put("abd", "mgg");
		System.out.println(t.get("k1"));
		System.out.println(t.get("k3"));
		System.out.println(t);
	}
}