package manoj1Loop;

import java.util.Scanner;

public class Prime_factors {
void pri_fac(){
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number :");
	int n,i,count=0;
	n=obj.nextInt();
	for(i=2;i<n;i++){
		while(n%i==0){
			System.out.println(i+" ");
			n/=i;
		}
	}
	if(n>2){
		System.out.println(n);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_factors obj1=new Prime_factors();
		obj1.pri_fac();
	}

}
