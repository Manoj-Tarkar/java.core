package manoj1Loop;

import java.util.Scanner;

public class Binary_to_Hexa {
void bin_hex(){
	int[] hex =new int [1000];
	int i=1,j=0,dec=0,bin,rem;
	Scanner obj =new Scanner(System.in);
	System.out.println("Enter the binary number  : ");
	bin=obj.nextInt();
    System.out.println("this is binary : "+bin);
    while(bin>0){
    	rem=bin%2;
    	dec=dec+rem*i;
    	i*=2;
    	bin/=10;
    }
    i=0;
    while(dec!=0){
    	hex[i]=dec%16;
    	dec=dec/16;
    	i++;
    }
    System.out.println("Hexa_Decimal number  : ");
    for(j=i-1;j>=0;j--){
    	if (hex[j]>9)
    		System.out.print((char)(hex[j]+55)+"\n");
    	else
    		System.out.print(hex[j]+"\n");
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_to_Hexa ob=new Binary_to_Hexa();
		ob.bin_hex();
	}

}
