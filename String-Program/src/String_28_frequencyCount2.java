import java.util.Scanner;

public class String_28_frequencyCount2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?  ?");
		String str=sc.nextLine();
		frequency(str);
	}

	private static void frequency(String str)
	{
		int count[]=new int[126];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				count[ch-65]++;
			}
			else if(ch >= 97 && ch <=122)
			{
				count[ch-97]++;
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)(i+65) + " <======>"+count[i]);
		}	
	}
}
/*
Enter Any String  ?  ?
Sandeepp
A <======>1
D <======>1
E <======>2
N <======>1
P <======>2
S <======>1
*/