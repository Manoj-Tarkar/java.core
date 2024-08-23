package manoj1Loop;
import java.util.Scanner;
public class String_Hexa
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str;
		int i = 0;
		System.out.print("Enter the String : ");
		str = input.next();
		System.out.print("Hexadecimal String : ");
 
		for (i = 0; i < str.length(); i++) 
		{
			System.out.printf("%02X ", (int) str.charAt(i));
		}
		System.out.println();
	}
}