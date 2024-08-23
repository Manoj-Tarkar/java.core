package manoj1Loop;

import java.util.Scanner;

public class NaturalNo {
void naturals(){
int n;
System.out.println("Enter choice no :");
Scanner obj1=new Scanner(System.in);
n=obj1.nextInt();
for(int i=1;i<=n;i++){
	System.out.println(i);
}}
  public static void main(String[] args){

	  NaturalNo obj=new NaturalNo();
	  obj.naturals();
			  
  }
}
