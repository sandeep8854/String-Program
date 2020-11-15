import java.util.Scanner;

public class String_15_LowersaceToUppercaseCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Word/Name in Lowercase ? ?");
		char ch=sc.next().charAt(0);
		
		int temp=(int) ch;
		temp=temp-32;
		ch=(char) temp;
		
		System.out.println("Equivalent Character in Uppercase: " +ch);
	}
}
/*
Enter Any Word/Name in Lowercase ? ?
w
Equivalent Character in Uppercase: W
*/