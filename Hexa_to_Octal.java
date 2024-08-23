package manoj1Loop;

import java.util.Scanner;

public class Hexa_to_Octal {
void hex_oct(){
Scanner ob=new Scanner(System.in);
System.out.println("enter the hexa decimal num :");
String hex=ob.nextLine();
int dec=0;
int c=hex.length()-1;
for(int i=0;i<hex.length();i++){
	char ch=hex.charAt(i);
	switch(ch){
	case '0':
	case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':
		dec=dec+Integer.parseInt(Character.toString(ch))*(int)Math.pow(16,c);
		c--;
		break;
	case 'a':
	case 'A':
		dec=dec+10*(int)Math.pow(16, c);
		c--;
		break;
	case 'b':
	case 'B':
		dec=dec+11*(int)Math.pow(16, c);
		c--;
		break;
	case 'c':
	case 'C':
		dec=dec+12*(int)Math.pow(16, c);
		c--;
		break;
	case 'd':
	case 'D':
		dec=dec+13*(int)Math.pow(16, c);
		c--;
		break;
	case 'e':
	case 'E':
		dec=dec+14*(int)Math.pow(16, c);
		c--;
		break;
	case 'f':
	case 'F':
		dec=dec+15*(int)Math.pow(16, c);
		break;
		default:
			System.out.println("invalid hexa num");
			break;
	}
}
String oct="";
while(dec>0)
{
	oct=dec%8+oct;
	dec=dec/8;
}
System.out.println("hexa num"+hex);
System.out.println("octal num"+oct);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hexa_to_Octal obj =new Hexa_to_Octal();
		obj.hex_oct();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	}

}