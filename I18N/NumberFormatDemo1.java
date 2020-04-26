import java.text.*;
import java.util.*;
class NumberFormatDemo1
{
	public static void main(String[] args)
	{
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("Italy form is : " +nf.format(d));
	}
}