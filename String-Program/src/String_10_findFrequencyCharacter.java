import java.util.Scanner;
public class String_10_findFrequencyCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ?  ?");
		String str=sc.nextLine();
		int len=str.length();
		for(char c='A';c<='z';c++)
		{
			int CharaCount=0;
			for(int j=0;j<len;j++)
			{
				char ch=str.charAt(j);
				if(ch==c)
				{
					CharaCount++;
				}
			}
			if(CharaCount>0)
			{
				System.out.println("The Character " + c + " has occurred for "+ CharaCount + " times");
			}	
		}	
	}
}
/*
Enter a String ?  ?
SandeepSssss
The Character S has occurred for 2 times
The Character a has occurred for 1 times
The Character d has occurred for 1 times
The Character e has occurred for 2 times
The Character n has occurred for 1 times
The Character p has occurred for 1 times
The Character s has occurred for 4 times
*/