import java.util.Scanner;

public class String_14_UppercaseToLowerCaseString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter One Word/Name in Uppercase ? ?");
		String strUpper=sc.nextLine();
		String strLower=strUpper.toLowerCase();
		System.out.println(" Equivalent Word/Name in Lowercase: " +strLower);	
	}
}
/*
Enter One Word/Name in Uppercase ? ?
JAVA CODE IN 
 Equivalent Word/Name in Lowercase: java code in 
*/