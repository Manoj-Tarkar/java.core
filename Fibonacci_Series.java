package manoj1Loop;

import java.util.Scanner;

public class Fibonacci_Series {

	void fib_ser(){
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the fibonacci num : ");
		int n=obj.nextInt();
		int b=1,a=0,i,c=0;
		for(i=1;i<=n;i++){
			System.out.println(c);
		a=b;
		b=c;
		c=a+b;
		}
	}
	 	public static void main(String[] args) {
			Fibonacci_Series ob=new Fibonacci_Series();
			ob.fib_ser();
	}

		}

