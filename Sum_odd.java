package manoj1Loop;

import java.util.Scanner;

public class Sum_odd {
void sum_odd(){
	System.out.print("Enter the num :");
	Scanner obj= new Scanner(System.in);
	int n=obj.nextInt();
	int sum=0;
	for (int s=1;s<=n;s++){
	if(s%2!=0)
		sum=sum+s;
	}
		System.out.print(sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_odd obj1=new Sum_odd();
		obj1.sum_odd();
}
}
