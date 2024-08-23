package manoj1Loop;

import java.util.Scanner;

public class Strong {
void strong_num(){
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter the number :");
	int n,n1,m,to=0;
	n=ob.nextInt();
	n1=n;
	while(0<n){
		 m=n%10;
		 to=to*10+m;
		n=n/10;
	}
	if (to==n1){
	System.out.print("this is strong :");
	}
	else{
		System.out.print("this is not strong :");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strong obj=new Strong();
		obj.strong_num();
	}

}
