package manoj;

import java.util.Scanner;

public class Kilometers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
        System.out.println("Enter distance in kilometers :");
        int a=ob.nextInt();
        System.out.println("the distance in miles is "+a*0.621371);
}
}