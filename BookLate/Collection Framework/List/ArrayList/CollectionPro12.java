import java.util.*;
class L extends ArrayList
{
	public static void main(String[] args)
	{
		L l = new L();
		l.add(9);
		l.add(0);
		l.add(90);
		l.add(19);
		l.add(81);
		l.add(80);
		l.add(18);
		l.add(83);
		System.out.println(l);
		
		l.removeRange(2,6);
		System.out.println(l);
	}
}