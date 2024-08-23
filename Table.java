package manoj1Loop;

import java.util.Scanner;

public class Table {
	void tables(){
	int n;
	Scanner obj1=new Scanner(System.in);
	System.out.println("Enter Starting no :");
	int s=obj1.nextInt();
	System.out.println("Enter Ending no :");
	int e=obj1.nextInt();
	System.out.println("Enter Table no :");
	int t=obj1.nextInt();
	while(s<=e){
		System.out.println(s+" * "+t+" = "+(s*t));
		s++;
	}}
	  public static void main(String[] args){

		  Table obj=new Table();
		  obj.tables();
				  
	  }
	}
