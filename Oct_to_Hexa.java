package manoj1Loop;

import java.util.Scanner;

public class Oct_to_Hexa {
void oct_hexa(){
	String oct,hex;
	int dec;
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the octal num : ");
	oct=ob.nextLine();
	System.out.println(" octal num : " +oct);
	dec=Integer.parseInt(oct,8);
	hex=Integer.toHexString(dec);
	System.out.println("hexa num : "+hex);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oct_to_Hexa ob=new Oct_to_Hexa();
		ob.oct_hexa();
	}

}
