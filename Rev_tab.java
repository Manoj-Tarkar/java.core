package manoj1Loop;

import java.util.Scanner;

public class Rev_tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.print("Enter The Starting Number : ");
		int s =obj.nextInt();
		System.out.print("Enter The Ending Number : ");
		int e =obj.nextInt();
		System.out.print("Enter The Tables Number : ");
		int t =obj.nextInt(); 
		while(s>=e){
			System.out.println(s+" * "+t+" = "+(s*t));
			s--;
	}
	}
}
