package manoj;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
		 System.out.println("Enter the coice ");
		 int p1=ob.nextInt();
	   double squ=Math.pow(p1,2);
	   System.out.println("the square of the no is " +squ);
}
}