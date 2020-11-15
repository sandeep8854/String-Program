import java.util.Scanner;
public class String_33_NumberToWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Any Number  ?  ?");
		int number=sc.nextInt();
		numberWord(number/10000000,"crore");
		numberWord(number/100000%100,"lakh");
		numberWord(number/1000%100,"thousand");
		numberWord(number/100%10,"hundred");
		numberWord(number%100," ");
	}

	private static void numberWord(int num, String str)
	{
		String one[]= {" "," one "," two "," three "," four "," five "," six "," seven "," eight "," nine "," ten "," eleven "
				," twelve "," thirteen "," fourteen ", " fifteen "," sixteen "," seventeen "," eighteen "," nineteen "};
		
		String two[]= {" "," "," twenty "," thirty "," forty "," fifty "," sixty "," seventy "," ninety "};
		
		if(num<20)
			System.out.print(one[num]);
		else
			System.out.print(two[num/10] + one[num%10]);
		if(num!=0)
			System.out.print(str+ "");
	}
}
