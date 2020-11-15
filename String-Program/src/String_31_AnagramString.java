import java.util.Scanner;
public class String_31_AnagramString 
{
	/*
	 * An anagram of a string is another string that contains the same characters, only the order of characters 
	 * can be different. For example, “abcd” and “dabc” are an anagram of each other.
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ?  ?");
		String str1=sc.nextLine();
		System.out.println("Enter Second String ?  ?");
		String str2=sc.nextLine();
		boolean rs=isAnagram(str1,str2);
		if(rs==true)
			System.out.println("String are Anagram .  .");
		else
			System.out.println("String are Not Anagram . .");
	}

	private static boolean isAnagram(String str1, String str2) 
	{
		int count[]=new int[26];
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch >= 65 && ch <=90)
				count[ch-65]++;
			else if(ch >=97 && ch <=122)
				count[ch-97]++;
		}
		
		for(int j=0;j<str2.length();j++)
		{
			char ch=str2.charAt(j);
			if(ch >= 65 && ch <=90)
				count[ch-97]--;
			else if(ch >= 97 && ch <= 122)
				count[ch-97]--;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				return false;
		}
		return true;
	}
}
