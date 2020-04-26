import java.text.*;
import java.util.*;
class NumberFormatDemo2
{
	public static void main(String[] args)
	{
		double d = 123456.789;
		Locale india = new Locale("pa", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(india);
		System.out.println("India Notation is : " +nf.format(d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US Notation is : " +nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK Notation is : " +nf2.format(d));
		
		NumberFormat nf3 = NumberFormat.getPercentInstance(india);
		System.out.println("India Notation is : " +nf3.format(d));
		
		NumberFormat nf4 = NumberFormat.getPercentInstance(Locale.US);
		System.out.println("US Notation is : " +nf4.format(d));
		
		NumberFormat nf5 = NumberFormat.getPercentInstance(Locale.UK);
		System.out.println("UK Notation is : " +nf5.format(d));
		
		NumberFormat nf6 = NumberFormat.getNumberInstance(india);
		System.out.println("India Notation is : " +nf6.format(d));
		
		NumberFormat nf7 = NumberFormat.getNumberInstance(Locale.US);
		System.out.println("US Notation is : " +nf7.format(d));
		
		NumberFormat nf8 = NumberFormat.getNumberInstance(Locale.UK);
		System.out.println("UK Notation is : " +nf8.format(d));
	}
}