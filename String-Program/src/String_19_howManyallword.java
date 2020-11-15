import java.util.Scanner;
public class String_19_howManyallword
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Any String/Name/Word  ?  ?");
		String str=scan.nextLine();
		count(str);	
	}
	private static void count(String str1)
	{
		int uc = 0,lc=0,vc=0,cc=0,dd=0,specialC=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				uc++;
				if(ch=='A' ||ch=='E' ||ch=='I'|| ch=='O' ||ch=='U')
				{
					vc++;
				}
				else
					cc++;
			}
			else if(ch >='a' && ch <='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vc++;
				}
				else
					cc++;
			}
			else if(ch >='0' && ch<='9')
				dd++;
			else
				specialC++;
		}
			
		System.out.println("Upper case are: " +uc);
		System.out.println("Lower case are: " +lc);
		System.out.println("Vowels Are: " +vc);
		System.out.println("Consonants are: " +cc);
		System.out.println("Digit are: "+ dd);
		System.out.println("Spacial Character: " + specialC);
	}
}
/*
Enter Any String/Name/Word  ?  ?
kgjrgjrg[rlgro24444@$%12423
Upper case are: 0
Lower case are: 13
Vowels Are: 1
Consonants are: 12
Digit are: 10
Speical Character: 4
*/