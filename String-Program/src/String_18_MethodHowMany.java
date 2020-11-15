import java.util.Scanner;

public class String_18_MethodHowMany 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ? ?");
		String str=sc.nextLine();
		System.out.println("Enter The Character ?");
		char ch=sc.next().charAt(0);
		int c=count(str,ch);
		System.out.println(c + " times");	
	}
	private static int count(String str, char c)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==c)
				count++;
		}
		return count;
	}
}
/*
Enter the String ? ?
sandeepsdfdddd
Enter The Character ?
d
6 times
*/