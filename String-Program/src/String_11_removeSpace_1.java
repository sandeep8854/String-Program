import java.util.Scanner;

public class String_11_removeSpace_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Sentence ?  ?");
		String str=sc.nextLine();
		
		//using replace method
		String strWithoutSpace=str.replaceAll(" ", "");
		System.out.println(strWithoutSpace);
	}
}
/*
Enter Any Sentence ?  ?
vinood sandeep like a friend
vinoodsandeeplikeafriend
*/