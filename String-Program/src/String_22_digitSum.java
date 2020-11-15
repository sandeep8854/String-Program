import java.util.Scanner;

public class String_22_digitSum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?  ?");
		String str=sc.nextLine();
		int sumstr=sumOfString(str);
		System.out.println(sumstr);
	}

	private static int sumOfString(String str1) 
	{
		int sum=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch >='0' && ch<='9')
				sum=sum+(ch-48);	
		}
		return sum;
	}
}
