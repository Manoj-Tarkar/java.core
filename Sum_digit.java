package manoj1Loop;

import java.util.Scanner;

public class Sum_digit {
void sum_digit(){
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the digit  no :");
	int n=scanner.nextInt();
	int sum=0,m;
	while(0<n){
		 m=n%10;
		sum=sum+m;
		n=n/10;
	}
	System.out.println("this is sum digit :" +sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_digit obj=new Sum_digit();
		obj.sum_digit();
}
}
