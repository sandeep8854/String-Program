import java.util.Scanner;
public class String_29_PanagramString 
{
	/*
	 * A pangram is a sentence that contains all letters of the alphabet. Less frequently, 
	 * such sentences are called holalphabetic sentences.
	 * example
	 * The quick brown fox jumps over a lazy dog.
	 */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ?");
		String str=sc.nextLine();
		boolean rs=isPanagram(str);
		if(rs==true)
			System.out.println("String is Panagram..");
		else
			System.out.println("String is Not Panagaram..");
	}

	private static boolean isPanagram(String str1)
	{
		if(str1.length()<26)
			return false;
		int count[]=new int[26];
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch>=65 && ch <=90)
			{
				count[ch-65]++;
			}
			else if(ch >=97 && ch <=122)
			{
				count[ch-97]++;
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}
}
/*
Enter Any String ?  ?
The quick brown fox jumps over a lazy dog
String is Panagram..
*/