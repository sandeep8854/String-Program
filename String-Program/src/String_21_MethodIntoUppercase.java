import java.util.Scanner;
public class String_21_MethodIntoUppercase
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any LoweCase Letter ? ?");
		String str=sc.nextLine();
		String upper=upper(str);
		System.out.println(upper);
		String upper1=upper1(str);
		System.out.println(upper1);
	}

	private static String upper1(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i] >= 'a' && ch[i] <='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		return new String (ch);
	}

	private static String upper(String str1)
	{
		String rs="";
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				ch=(char)(ch-32);
			}
			rs=rs+ch;
		}
		return rs;
	}
}
/*
Enter Any LoweCase Letter ? ?
sanddepp prajapati
SANDDEPP PRAJAPATI
SANDDEPP PRAJAPATI
*/
