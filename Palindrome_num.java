package manoj1Loop;

import java.util.Scanner;

public class Palindrome_num {
void pal_num(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the choice num : ");
	int n=ob.nextInt();
    int n1,rem,total=0;
	n1=n;
	while(n>0){
		rem=n%10;
		total=total*10+rem;
		n/=10;
	}
	if(total==n1){
		System.out.println("palindrome num ");
	}
	else
	{
		System.out.println(" not palindrome num ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome_num obj=new Palindrome_num ();
		obj.pal_num();
	}

}
