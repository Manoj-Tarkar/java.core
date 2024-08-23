package manoj1Loop;

import java.util.Scanner;

public class Addition_N {
void add_n(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the choice num : ");
	int n=ob.nextInt();
	int sum=0;
	
	for(int i=1;i<=n;i++){
		System.out.printf(" number: "+i);
		int num=ob.nextInt();
		sum=sum+num;
		System.out.println("total : "+sum);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition_N obj=new Addition_N();
		obj.add_n();
	}

}
