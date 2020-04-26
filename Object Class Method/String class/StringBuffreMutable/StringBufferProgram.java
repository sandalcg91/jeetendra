public class StringBufferProgram
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("chandan");
		System.out.println(sb);
		
		// capacity
		System.out.println(sb.capacity());
		
		// length
		System.out.println(sb.length());
		
		// append
		System.out.println(sb.append(" gupta"));
		
		//insert
		StringBuffer sb1 = new StringBuffer("manish");
		System.out.println(sb1.insert(6," ji"));
		
		// delete  and deleteCharAt
		System.out.println(sb1.delete(1,5));
		StringBuffer sb2 = new StringBuffer("sandal");
		System.out.println(sb2.deleteCharAt(2));
		
		// reverse
		StringBuffer sb3 = new StringBuffer("payal");
		System.out.println(sb3.reverse());
		
		// setLength
		//StringBuffer sb4 = new StringBuffer("   Shreya   ");
		//System.out.println(sb4.trimToSize());
	}
}