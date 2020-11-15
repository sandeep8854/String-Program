
public class String_2JoinTwoString {

	public static void main(String[] args)
	{
		//create a String
		String str="Hello";
		System.out.println("First String " +str);
		
		String str1="World";
		System.out.println("Second String "+ str1);
		
		//join two strings
		
		String str2=str.concat(str1);
		System.out.println("Joined String " +str2);
		
		String str3=str+str1;
		System.out.println(str3);
		

	}

}
