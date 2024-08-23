package manoj1Loop;

import java.util.Scanner;

public class Largest_Smallest {
void lar_sma(){
	Scanner ob=new Scanner(System.in);
	int min=Integer.MIN_VALUE;
	int max=Integer.MAX_VALUE;
	
	char choice;
	do{
		System.out.println("Enter the number : ");
		int num=ob.nextInt();
	if(num>max){
		max=num;
	}
	if(num<min)
	{
		min=num;
	}
	System.out.println("do you want to continue y/n : " );
	choice=ob.next().charAt(0);
	
	}while(choice=='y' || choice=='Y');
	System.out.println("maximum num : "+max );
	System.out.println("minimum : " +min);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_Smallest obj=new Largest_Smallest();
		obj.lar_sma();
	}

}
