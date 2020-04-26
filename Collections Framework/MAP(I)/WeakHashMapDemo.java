import java.util.*;
public class WeakHashMapDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t,"CHandan");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}
class WeakHashMapDemo1
{
	public static void main(String[] args) throws InterruptedException
	{
		WeakHashMap wm = new WeakHashMap();
		Temp t1 = new Temp();
		wm.put(t1,"CHandan");
		System.out.println(wm);
		t1=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(wm);
	}
}
class Temp
{
	public String toString()
	{
		return "Temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method Called");
	}
}