package manoj1Loop;

import java.util.Scanner;

public class Dec_to_Hexa {
void dec_hexa(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the decimal number : ");
	int dec=ob.nextInt();
	int rem;
	String str="";
	char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	while(dec>0)
	{
		rem=dec%16;
		str=hex[rem]+str;
		dec=dec/16;
	}
	System.out.println("Decimal tol hexa  : "+str);
}
public static void main(String[] args){
	Dec_to_Hexa obj=new Dec_to_Hexa();
	obj.dec_hexa();
}}
