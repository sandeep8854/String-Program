import java.util.Scanner;

public class String_6_UserInput 
{
	public static void main(String[] args) 
	{
		//String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Name ? ?");
		String str=sc.nextLine();
		
		System.out.println("Hello, " +str);
	}
}
/*
Enter Your First Name ? ?
Sandeep
Hello, Sandeep
*/