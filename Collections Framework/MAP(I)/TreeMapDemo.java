import java.util.*;
public class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap m = new TreeMap();
		m.put(100, "XXXX");
		m.put(101, "SS");
		m.put(103, "ZZ");
		m.put(102, "TT");
		m.put(105, 200);
	//	m.put(104, null);
	//	m.put("zzz", "xxx"); // CCE
	//	m.put(null, "xxx"); // NPE
		System.out.println(m);
	}
}