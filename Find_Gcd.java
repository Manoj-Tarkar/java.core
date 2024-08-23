package manoj1Loop;

import java.util.Scanner;

public class Find_Gcd {
void find_gcd(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the choice num : ");
	int num1=ob.nextInt();
	int num2=ob.nextInt();
    int rem=0,x=0,y=0;
    if(num1>num2)
    {
    	x=num1;
    	y=num2;
    }
    else{
    	x=num2;
    	y=num1;
    }
    rem=x%y;
    while(rem!=0)
    {
    	x=y;
    	y=rem;
    	rem=x%y;}
    	System.out.println("Greatest common divisor is :"+y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_Gcd ob=new Find_Gcd();
		ob.find_gcd();
	}

}
