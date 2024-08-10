package manoj;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
		 System.out.println("Enter the coice ");
		 System.out.println("enter the no");
	   int p1,p2;
	   p1=ob.nextInt();
	   p2=ob.nextInt();
	  /* if (p1>p2){
		   System.out.println("The greater number is "+p1);
	   }else if (p2>p1) {  
		 System.out.println("The greater number is "+p2);
	   }
		   else{
			   System.out.println("The both of equal"+p2);
		   }*/
	   
	   
	   int  greater=Math.max(p1, p2);
	   System.out.println("The greater then"+greater);
	   
	   
	}
}

