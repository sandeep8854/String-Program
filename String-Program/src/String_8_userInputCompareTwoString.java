import java.util.Scanner;

public class String_8_userInputCompareTwoString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String  ?");
		String str1=sc.nextLine();
		
		System.out.println("Enter Second String ?");
		String str2=sc.nextLine();
		
		if(str1.compareTo(str2) > 0)
		{
			System.out.println("First String is Greater than Second String");
		}
		else if(str1.compareTo(str2) <0)
		{
			System.out.println("First String is Smaller than Second String.");
		}
		else
		{
			System.out.println("Both String Are Equal");
		}	
	}
}
