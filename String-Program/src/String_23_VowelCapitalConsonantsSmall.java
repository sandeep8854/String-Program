import java.util.Scanner;

public class String_23_VowelCapitalConsonantsSmall {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ?");
		String str=sc.nextLine();
		System.out.println(convertor(str));
	}

	private static String convertor(String str)
	{
		String rs="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch >='A' && ch <='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					rs=rs+ch;
				}
				else{
					ch=(char)(ch+32);
					rs=rs+ch;
			      }
			}
			else if(ch >='a' && ch <='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					ch=(char)(ch-32);
					rs=rs+ch;
				}
				else {
					rs=rs+ch;
				}
			}
			else
			{
				rs=rs+ch;
			}
		}
		return rs;
	}
}
/*
Enter Any String ?  ?
aeiouMNLKJH
AEIOUmnlkjh
*/