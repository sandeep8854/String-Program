import java.util.Scanner;
public class String_10_RemoveVowelMethod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		
		System.out.println("Removing Vowel From String [" +str+ "]");
		String r=removeVowel(str);
		System.out.println("Vowels Removed from the Entered String Successfully..!!\nNow the String is :\n");
		System.out.println(r);
	}
	private static String removeVowel(String s)
	{
		String finalString="";
		for(int i=0;i<s.length();i++)
		{
			if(!isVowel(Character.toLowerCase(s.charAt(i))))
			{
				finalString=finalString+s.charAt(i);
			}
		}
		return finalString;
	}
	private static boolean isVowel(char c)
	{
		String vowels="aeiou";
		for(int i=0;i<5;i++)
		{
			if(c==vowels.charAt(i))
			{
				return true;
			}
		}	
		return false;
	}
}
/*
Enter a String :
Sandeep
Removing Vowel From String [Sandeep]
Vowels Removed from the Entered String Successfully..!!
Now the String is :

Sndp
*/