import java.util.Scanner;
public class String_20_MethodIntolowercase 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Name/Word in UpperCase ?  ?");
		String str=sc.nextLine();
    	System.out.println(lower(str));	
		System.out.println(lower1(str));
	}
	private static String lower1(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
	private static String lower(String str) 
	{
		String rs="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				ch=(char)((char)ch+32);
			}
			rs=rs+ch;
		}
		return rs;
	}
}
/*
 Enter Any Name/Word in UpperCase ?  ?
SANDEEP PRAJAPATI
sandeep prajapati
sandeep prajapati
*/
