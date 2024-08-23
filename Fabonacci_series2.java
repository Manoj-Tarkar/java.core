package manoj1Loop;

import java.util.Scanner;

public class Fabonacci_series2 {
void fab_ser(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the length of fibo :");
	int n=ob.nextInt();
	int[] num=new int[n];
	num[0]=0;
	num[1]=1;
	for(int i=2;i<n;i++)
	{
		num[i]=num[i-1]+num[i-2];
	}
	System.out.println("Fibonacci series :");
	for(int i=0;i<n;i++){
		System.out.println(num[i]+" ");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fabonacci_series2 obj=new  Fabonacci_series2();
		obj.fab_ser();
	}

}
