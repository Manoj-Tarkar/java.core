package manoj1Loop;

import java.util.Scanner;

public class Pow_num {
void pow_num(){
	   Scanner ob=new Scanner(System.in);
	   System.out.println("Enter the Base no");   
	   int b=ob.nextInt();
	   System.out.println("Enter the Power no");   
	   int p=ob.nextInt();
	   int result=1;
	    
	   for (int i=1;i<=p;i++){
		   result*=b;
	   }
	   System.out.println("Enter the result :"+result);   
	   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow_num obj=new Pow_num();
		obj.pow_num();
	}

}
