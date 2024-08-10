package manoj;

import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your chice no");
		int a;
		a=scanner.nextInt();
		if(a>0){
			System.out.println("Positive");
		}
		 if(a==0){
		    System.out.println("zero");	 
			
		}
		if(a<0){
			 System.out.println("Negitive"); 
		 }
	}

}
