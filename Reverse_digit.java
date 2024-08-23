package manoj1Loop;

import java.util.Scanner;

public class Reverse_digit {
void rev_digt(){
	Scanner ob =new Scanner(System.in);
	System.out.println("Enter the Reverse no :");
	int n=ob.nextInt();
	int rev=0,m;
	while(0<n){
		 m=n%10;
		rev=rev*10+m;
		n=n/10;
	}
	System.out.println("this is rev :" +rev);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_digit obj=new Reverse_digit();
		obj.rev_digt();
	}

}
