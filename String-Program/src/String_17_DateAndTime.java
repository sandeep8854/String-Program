import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class String_17_DateAndTime
{
	public static void main(String[] args)
	{
		Date dnow=new Date();
		SimpleDateFormat ft1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat ft2=new SimpleDateFormat("E");
	    SimpleDateFormat ft3=new SimpleDateFormat("hh:mm:ss a");
	    
	    System.out.println("The Current Date is " +ft1.format(dnow));
	    System.out.println("Today is " +ft2.format(dnow) );
	    System.out.println("Current Time is "+ft3.format(dnow));	
	}
}
/*
The Current Date is 21/10/2020
Today is Wed
Current Time is 02:36:45 PM
*/