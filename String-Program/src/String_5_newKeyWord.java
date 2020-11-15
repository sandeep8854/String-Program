
public class String_5_newKeyWord 
{
	public static void main(String[] args)
	{
		//create String Using new keyword
		String str1=new String("Hello! World");
		
		//return substring word
		System.out.println("Using the subString() " +str1.substring(7));
		
		//convert the String to lowercase
		System.out.println("Using the toLowerCase " +str1.toLowerCase());
		
		//convert the String the Uppercase
		System.out.println("Using The toUppercase " +str1.toUpperCase());
		
		//replace the character '!' to 'o'
		System.out.println("Using The Replace() " +str1.replace('!', 'o') );
		
	}

}
/*
Using the subString() World
Using the toLowerCase hello! world
Using The toUppercase HELLO! WORLD
Using The Replace() Helloo World
*/