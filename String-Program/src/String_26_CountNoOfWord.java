import java.util.Scanner;

public class String_26_CountNoOfWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String  ?  ?");
		String str=sc.nextLine();
		System.out.println(count(str));
	}

	private static int count(String str)
	{
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' ||ch[i]!=' ' && ch[i-1]==' ')
			{
				count++;
			}
		}	
		return count;
	}
}
