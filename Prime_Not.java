
package manoj1Loop;

import java.util.Scanner;

public class Prime_Not {
void pri_not(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the value :");
	int num=ob.nextInt();
	int i,count=0;
	for (i=2;i<num;i++){
		if(num%i==0){
			count++;
			break;
		}}
		if(count==0){
			System.out.println("this is prime no");}
			else{
				System.out.println("this is not prime no");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Not obj=new Prime_Not();
		obj.pri_not();
		}
	}


