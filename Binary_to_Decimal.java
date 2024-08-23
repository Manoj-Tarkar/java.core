package manoj1Loop;

import java.util.Scanner;

public class Binary_to_Decimal {
void bin_dec(){
	Scanner ob=new Scanner(System.in);
	long bin, i=1,rem,dec=0;
	System.out.println("Enter binary num : ");
	bin=ob.nextLong();
	System.out.println("this is binary num : "+bin);
	while(bin!=0){
		rem=bin%10;
		dec=dec+rem*i;
		i=i*2;
		bin =bin/10;
		}
		System.out.println("decimal  num : "+dec);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_to_Decimal obj =new Binary_to_Decimal();
		obj.bin_dec();
	}

}
