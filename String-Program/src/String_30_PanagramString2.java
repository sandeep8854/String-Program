import java.util.Scanner;

public class String_30_PanagramString2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ?");
		String str=sc.nextLine();
		boolean rs=isPanagram(str);
		if(rs==true)
			System.out.println("String is Panagram . .");
		else
			System.out.println("String is Not Panagram  . .");
	}
	private static boolean isPanagram(String str1)
	{
		if(str1.length()<26)
			return false;
		str1=str1.toLowerCase();
		for(char ch='a';ch <='z';ch++)
		{
			if(str1.indexOf(ch)==-1)
				return false;
		}
		return true;
	}
}
/*
Enter Any String ?  ?
The quick brown fox jumps over a lazy dog
String is Panagram . .
*/