package manoj;

import java.util.Scanner;

public class Aver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
		 System.out.println("Enter the coice ");
		 System.out.println("enter the no");
	   int p1,p2,p3;
	   p1=ob.nextInt();
	   p2=ob.nextInt();
	   p3=ob.nextInt();
	   float ave=(p1+p2+p3)/3;
	   System.out.println("enter the no :"+ave);
	}

}
