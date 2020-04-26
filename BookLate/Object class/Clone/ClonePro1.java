public class ClonePro1 implements Cloneable
{
	int i;
	public static void main(String[] args)
	{
		ClonePro1 cp1 = new ClonePro1();
		ClonePro1 cp3 = new ClonePro1();
		ClonePro1 cp2;
		
		cp1.i = 90;
		try
		{
			cp2 = (ClonePro1)cp1.clone();
			cp1.i = 50;
			System.out.println(cp2.i);
		}
		catch(CloneNotSupportedException cnse)
		{
			System.out.println(cnse);
		}
		System.out.println(cp1.i);
	}
}