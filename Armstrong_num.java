package manoj1Loop;

import java.util.Scanner;

public class Armstrong_num {
void arm_num(){
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the arm num : ");
	int n,n1,t=0,rem;
	n=obj.nextInt();
	n1=n;
	while(n>0){
		rem=n%10;
		t=t+(rem*rem*rem);
		n/=10;
	}
	if(n1==t){
		System.out.println("Armstrong num ");
	}
	else
		System.out.println("not Armstrong num ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong_num ob=new Armstrong_num();
		ob.arm_num();

	}}
