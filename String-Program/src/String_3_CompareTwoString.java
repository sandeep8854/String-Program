
public class String_3_CompareTwoString {

	public static void main(String[] args) 
	{
		//create String
		String str1="Java Programming";
		String str2="Java Programming";
		String str3="Python Programming";
		
		//compare first and Second String
		boolean result1=str1.equals(str2);
		System.out.println("String First And Second Are Equals " +result1 );
		
		//compare First And Third
		boolean result2=str1.equals(str3);
		System.out.println("String First And Third Are Equals " + result2);
	}
}
/*
String First And Second Are Equals true
String First And Third Are Equals false
*/