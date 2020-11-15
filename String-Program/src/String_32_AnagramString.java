
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class String_32_AnagramString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ?  ?");
		String str1=sc.nextLine();
		System.out.println("Enter Second String  ?  ?");
		String str2=sc.nextLine();
		boolean rs=isAnagram(str1,str2);
		if(rs==true)
			System.out.println("String Are Anagram . .");
		else
			System.out.println("String Are Not Anagram . .");
	}

	private static boolean isAnagram(String str1, String str2) 
	{
		str1=str1.replace(" ", " ");
		str2=str2.replace(" ", " ");
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
			return true;
		else
			return false;
		//return Arrays.equals(ch1, ch2);
	}
}
