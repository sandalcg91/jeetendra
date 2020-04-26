import java.text.*;
import java.util.*;
class NumberFormatDemo3
{
	public static void main(String[] args)
	{
		NumberFormat nf = NumberFormat.getInstance();
		
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(123.4567));
		System.out.println(nf.format(123.4));
		
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(123.4567));
		System.out.println(nf.format(123.4));
		
		nf.setMaximumIntegerDigits(3);
		System.out.println(nf.format(123456.457));
		System.out.println(nf.format(12.3456));
		
		nf.setMinimumIntegerDigits(3);
		System.out.println(nf.format(123456.123));
		System.out.println(nf.format(12.3456));
	}
}