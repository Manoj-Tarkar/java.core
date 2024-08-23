package manoj1Loop;

import java.util.Scanner;

public class Even_num {
void even_nums(){
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	if(n%2==0){
		System.out.println("Even num");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even_num obj1=new Even_num();
		obj1.even_nums();
	}

}
