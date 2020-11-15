import java.util.Scanner;
public class String_13_UppercaseToLowercaseCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character in Uppercase : ");
		char ch=sc.next().charAt(0);
	int	temp=(int) ch;
	temp=temp+32;
	ch=(char)temp;
	System.out.println("Equivalent Character in Lowercase = " +ch);
	}
}
/*
Enter a Character in Uppercase : 
A
Equivalent Character in Lowercase = a
*/