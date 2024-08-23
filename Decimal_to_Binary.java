package manoj1Loop;

import java.util.Scanner;

public class Decimal_to_Binary {
void dec_bin(){
	int dec,i=0;
	int[] binary=new int[20];
	System.out.println("enter the num :");
	Scanner obj=new Scanner(System.in);
	dec=obj.nextInt();
    while(dec!=0)
    {
    	    	binary[i]=dec%2;
    	i++;
    	dec=dec/2;
    }
    System.out.println("bin nujm :");
    for(i=(i-1);i>=0;i--)
    	System.out.print(binary[i]);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decimal_to_Binary ob=new Decimal_to_Binary();
		ob.dec_bin();
	}

}
