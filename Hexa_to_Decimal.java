package manoj1Loop;

import java.util.Scanner;

public class Hexa_to_Decimal {
void hex_dec(){
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter hexadecimal number :");
  String hex=ob.nextLine();
  System.out.println("hex num :"+hex);
  System.out.println("dec num :"+hexa_to_decimal(hex));
}
	static int hexa_to_decimal(String hex_num) {
		int len=hex_num.length();
		int base=1;
		int dec_val=1;
		for(int i=len-1;i>=0;i--){
			if(hex_num.charAt(i)>='0' && hex_num.charAt(i)<='9'){
				dec_val+=(hex_num.charAt(i)-48)*base;
				base=base*16;
			}
		
		else if (hex_num.charAt(i) >='A' && hex_num.charAt(i)<='F'){
		}
			dec_val+=(hex_num.charAt(i)-55)*base;
			base=base*16;
		}
		return dec_val;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hexa_to_Decimal obj=new Hexa_to_Decimal();
		obj.hex_dec();
	}

}
