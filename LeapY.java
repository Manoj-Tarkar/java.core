package manoj;

import java.util.Scanner;

public class LeapY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
        System.out.println("Enter leap year value :");
        int a=ob.nextInt();
        if ((a%4==0 && a%100!=0)||(a%400==0)){
        	System.out.print("leap year");
        }
        else{
        	System.out.print(" not leap year");
        }
	}

}
