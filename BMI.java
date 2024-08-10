package manoj;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
		int kilo;
		float meter,total;
        System.out.println("Enter weight in kilograms:");
         kilo=ob.nextInt();
        System.out.println("Enter height in meters :");
         meter=ob.nextFloat();
         total=kilo/(meter*meter);
        System.out.println(total);
	}

}
