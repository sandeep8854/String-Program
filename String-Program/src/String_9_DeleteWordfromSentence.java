import java.util.Scanner;

public class String_9_DeleteWordfromSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ?  ?");
		String strOrig=sc.nextLine();
		
		System.out.println("Enter a Word to be Delete from the String:");
		String word=sc.nextLine();
		
	//	System.out.println("Deleting all " +word+ " from " +strOrig);
		strOrig=strOrig.replaceAll(word, "");
		
		System.out.println("Specified word deleted Successfully from the String");
		
		System.out.println("Now the String is:");
		
		System.out.println(strOrig);
	}
}
/*
Enter The String ?  ?
easy easy fant easy
Enter a Word to be Delete from the String:
easy
Specified word deleted Successfully from the String
Now the String is:
  fant
*/