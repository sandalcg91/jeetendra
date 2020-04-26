import java.util.*;
import java.text.*;
public class DateFormatDemo
{
	public static void main(String[] args)
	{
	//	System.out.println("Full form : " +DateFormat.getDateInstance(0).format(new Date()));
		
		DateFormat df = DateFormat.getDateInstance(0);
		System.out.println("Full From   : "+df.format(new Date()));
	
		System.out.println("Long Form   : "+df.getDateInstance(1).format(new Date()));
		System.out.println("Medium Form : "+df.getDateInstance(2).format(new Date()));
		System.out.println("Short Form  : "+df.getDateInstance(3).format(new Date()));
		
		
	//  US Date Format
		System.out.println("US From : "+df.getDateInstance(0,Locale.US).format(new Date()));
	
	//  UK Date Format
		System.out.println("UK From : "+df.getDateInstance(0,Locale.UK).format(new Date()));
		
	//  Italy Date Format
		System.out.println("Italy From : "+df.getDateInstance(0,Locale.ITALY).format(new Date()));
		
		
	//  US Date Time Format
		System.out.println("US From : "+df.getDateTimeInstance(0,0,Locale.US).format(new Date()));
	
	//  UK Date Time Format
		System.out.println("UK From : "+df.getDateTimeInstance(0,0,Locale.UK).format(new Date()));
		
	//  Italy Date Time Format
		System.out.println("Italy From : "+df.getDateTimeInstance(0,0,Locale.ITALY).format(new Date()));
	}
}