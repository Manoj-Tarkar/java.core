package manoj1Loop;

import java.util.Scanner;

public class Octal_to_Bin {
void oct_bin(){
	Scanner ob=new Scanner(System.in);
	long dec=0,oct;
	int i=0;
	System.out.println("Enter octal num : ");
	oct=ob.nextLong();
	System.out.println(" octal num : "+oct);
	while(oct!=0){
		
		dec=(long) (dec+(oct%10)*Math.pow(8,i++));
		oct/=10;
}
	System.out.println("decimal num : "+dec);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Octal_to_Bin obj=new Octal_to_Bin();
			obj.oct_bin();
		}
	}


