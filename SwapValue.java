package manoj;

import java.util.Scanner;

public class SwapValue {
	public static void main(String[] args) {
		
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a=ob.nextInt();
        System.out.println("Enter the second number :");
        int b=ob.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping,first number is "+a+" and second number is "+b);
	
}
}