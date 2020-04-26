import java.util.*;
class EnumerationDemo1
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		Vector v1 = new Vector();
		for(int i=2; i<=20; i++)
		{
			v.addElement(i);
		}
	    System.out.println(v);
		System.out.println("------------------");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Integer I = (Integer)e.nextElement();
			int flag = 0;
			for(int i=2; i<I; i++)
			{
				if(I%i==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(I);
				v1.addElement(I);
			}
		}
		System.out.println(v1);
	}
}