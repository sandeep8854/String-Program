import java.util.Scanner;
public class String_27_firstcharacterUpperandremmaingLowercsae {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?  ?");
		String str=sc.nextLine();
		System.out.println(coword(str));
	}
	private static String coword(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' ||ch[i]!=' ' &&ch[i]==' ')
			{
				if(ch[i]>='a' && ch[i] <='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
				else if(ch[i] >='A' && ch[i] <='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}	
			}	
		}
		return new String(ch);
	}
}
/*
Enter Any String  ?  ?
sandeep prajapati
Sandeep prajapati
*/