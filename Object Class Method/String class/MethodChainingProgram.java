public class MethodChainingProgram
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("chandan ");
		
		System.out.println(sb.append('g').append('u').append('p').append('t').append('a').substring(0,12));
		
		
		StringBuilder sb1 = new StringBuilder("chandan ");
		
		System.out.println(sb1.append('g').append('u').append('p').append('t').append('a').substring(0,13));
	}
}