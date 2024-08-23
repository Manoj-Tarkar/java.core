package manoj1Loop;

import java.util.Scanner;

public class Decimal_to_Octal {
void  dec_oct(){
	Scanner obj =new Scanner(System.in);
	System.out.println("Enter the decimal number :");
	int dec=obj.nextInt();
	System.out.println("this is decimal number : "+dec);
	int oct=convert_dec_oct(dec);
	System.out.println("this is octal number :"+oct);
}

	private int convert_dec_oct(int dec) {
		int octNumber=0,i=1;
		while(dec!=0){
			octNumber+=(dec%8)*i;
			dec/=8;
			i*=10;
		}
		return octNumber;
	// TODO Auto-generated method stub
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decimal_to_Octal ob=new Decimal_to_Octal();
		ob.dec_oct();
	}

}
