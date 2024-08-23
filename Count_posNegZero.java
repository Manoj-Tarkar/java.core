package manoj1Loop;

import java.util.Scanner;

public class Count_posNegZero {
void cou_pos_neg_zero(){
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter the num : ");
	int c_pos=0,c_neg=0,c_zer=0;
	char choice;
	do{
		int num =ob.nextInt();
		if(num>0){
			c_pos++;
		}
		else if(num<0){
			c_neg++;
		}
		else{
			c_zer++;
		}
		System.out.print("Do you want to continue y/n : " );
		choice=ob.next().charAt(0);
	}
	while(choice=='y' || choice=='Y');
    System.out.println("Positive num  : "+c_pos);
    System.out.println("Negitive num : "+c_neg);
    System.out.println("Zero num : "+c_zer);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_posNegZero obj=new Count_posNegZero();
		obj.cou_pos_neg_zero();
	}

}
