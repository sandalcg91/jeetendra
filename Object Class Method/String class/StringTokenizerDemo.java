import java.util.*;
public class StringTokenizerDemo
{
	public static void main(String[] args)
	{
		StringTokenizer token = new StringTokenizer("java is a programming language");
		while(token.hasMoreTokens())
		{
			System.out.println(token.nextToken());
		}
		
		System.out.println("-=----------------=-----");
		
		StringTokenizer token1 = new StringTokenizer("1,00,00,00,000", ",");
		while(token1.hasMoreTokens())
		{
			System.out.println(token1.nextToken());
		}
		
		
	}
}