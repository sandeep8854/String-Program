import java.util.Scanner;

public class String_25_reverseSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Sentence ?  ?");
		String str=sc.nextLine();
		System.out.println(reverseSentence(str));	
	}

	private static String reverseSentence(String str)
	{
		String rs="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				rs=rs+ch[j];
				j++;
			}
			if(i>0)
				rs=rs+ch[i];
		}
	    return rs;
	}
}
/*
Enter Any Sentence ?  ?
tecnology health for not is Subex
Subex is not for health tecnology
*/