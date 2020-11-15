import java.util.Scanner;
public class String_28_frequencyCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String ?  ?");
		String str=sc.nextLine();
		frequency(str);
	}
	private static void frequency(String str)
	{
		int count[]=new int[126];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i +" <<---- " +count[i]);
		}	
	}
}
/*
Enter Any String ?  ?
aaappqqrrsstttuuuvvvvwwxyz
a <<---- 3
p <<---- 2
q <<---- 2
r <<---- 2
s <<---- 2
t <<---- 3
u <<---- 3
v <<---- 4
w <<---- 2
x <<---- 1
y <<---- 1
z <<---- 1
*/