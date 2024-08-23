package manoj1Loop;

import java.util.Scanner;

public class Odd_num {
	void odd_nums(){
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n%2!=0){
			System.out.println("Odd num");
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Odd_num obj1=new Odd_num();
			obj1.odd_nums();
}
}