package manoj1Loop;

import java.util.Scanner;

public class Binary_to_octal {
void bin_oct(){
	Scanner ob=new Scanner(System.in);
	int bin,i=1,j;
	int oct[]=new int[100];
	System.out.println("Enter the  bin num : ");
	bin=ob.nextInt();
	while(bin!=0){
		oct[i++]=bin%8;
		bin=bin/8;
		
	}
	System.out.println("octal num : ");
	for(j=(i-1);j>0;j--){
		System.out.print(oct[j]);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_to_octal obj=new Binary_to_octal();
		obj.bin_oct();
	}

}
