import java.util.*;
class C
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(90);
		al.add("abc");
		al.add('s');
		al.add(true);
		al.add(235.52);
		System.out.println(al.size());
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}