import java.util.Scanner;

public class String_24_reverseWordSentence 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ?");
		String str=sc.nextLine();
		System.out.println(reverseWord(str));
	}
	private static String reverseWord(String str) 
	{
		String rs="";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			int k=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				rs=rs+ch[j];
				j--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}	
		return rs;
	}
}
/*
Enter Any String ?  ?
java is very easy language
avaj si yrev ysae egaugnal
*/