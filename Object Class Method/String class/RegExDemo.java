import java.util.regex.*;
public class RegExDemo
{
	public static void main(String[] args)
	{
	/*	Pattern p = Pattern.compile("[a-zA-Z._][a-zA-Z0-9._]+");
		Matcher m = p.matcher(args[0]);
		if(m.find()&&m.group().equals(args[0]))
		{
			System.out.println("valid Identifier");
		}
		else
		{
			System.out.println("Invalid Identifier");
		}
	*/
		// gmail pattern
	Pattern p1 = Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-z0-9]+([.][a-zA-Z]+)+");
		Matcher m1 = p1.matcher(args[0]);
		if(m1.find()&&m1.group().equals(args[0]))
		{
			System.out.println("valid Email Id");
		}
		else
		{
			System.out.println("Invalid Email ID");
		}
	}
}