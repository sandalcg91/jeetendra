public class ClonePro2 implements Cloneable
{
	int i;
	protected Object clone() throws CloneNotSupportedException
	{
		ClonePro2 cp = new ClonePro2();
		cp.i = this.i;
		return cp;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ClonePro2 cp1 = new ClonePro2();
		ClonePro2 cp3 = new ClonePro2();
		ClonePro2 cp2 = (ClonePro2)cp1.clone();
		
		System.out.println(cp1.i); // 0
		System.out.println(cp2.i); // 0
	}
}