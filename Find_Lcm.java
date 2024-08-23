package manoj1Loop;

import java.util.Scanner;

public class Find_Lcm {
void find_lcm(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the choice num : ");
    int num1=ob.nextInt();
    int num2=ob.nextInt();
    int rem=0,x=0,y=0,lcm=0;
    if(num1>num2){
    	x=num1;
    	y=num2;
    }
    else{
    	x=num2;
    	y=num1;
    }
    rem=x%y;
    while(rem!=0){
    	x=y;
    	y=rem;
    	rem=x%y;
    }
    lcm=num1*num2/y;
    System.out.println("lowest common multiple is :"+lcm);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_Lcm obj=new Find_Lcm();
		obj.find_lcm();
	}

}
