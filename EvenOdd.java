package manoj;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
		 System.out.println("Enter the coice no");
        int a;
        a=ob.nextInt();
       if (a%2==0){
    	   System.out.println("Even");
       }
       else{
    	   System.out.println("Odd");
       }
	}

}
