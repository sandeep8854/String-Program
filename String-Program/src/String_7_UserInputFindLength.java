import java.util.Scanner;

public class String_7_UserInputFindLength
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name ? ?");
		String str=sc.nextLine();
		
		int len=str.length();
		System.out.println("Length of Entered String Is: " +len);
	}
}
/*
Enter Your Name ? ?
Sandeep Prajapati
Length of Entered String Is: 17
*/