import java.util.Scanner;

public class String_16_LowercaseToUppercaseString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Word/Name Lowercase ?  ?");
		String strlower=sc.nextLine();
		
		String uppercase=strlower.toUpperCase();
		System.out.println(" Equivalent Word/Name in Uppercase : " +uppercase);
	}
}
/*
Enter Any Word/Name Lowercase ?  ?
chact technology pvt. limited
 Equivalent Word/Name in Uppercase : CHACT TECHNOLOGY PVT. LIMITED
*/