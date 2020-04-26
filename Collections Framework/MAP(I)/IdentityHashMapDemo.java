import java.util.*;
class IdentityHashMapDemo
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "Payal");
		System.out.println(m.put(i2, "Chandan")); //payal - duplicate key not allowed

		System.out.println(i1==i2); // false
		System.out.println(i1.equals(i2));  // true
		System.out.println(m);  // {10=Chandan}

		IdentityHashMap im = new IdentityHashMap();
		Integer i11 = new Integer(10);
		Integer i12 = new Integer(10);
		im.put(i11, "Payal");
		im.put(i12, "Chandan");

		System.out.println(im); // {10=Chandan, 10==Payal}
	}
}