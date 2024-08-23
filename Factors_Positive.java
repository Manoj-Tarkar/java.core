package manoj1Loop;

import java.util.Scanner;

public class Factors_Positive {
void fac_pos(){
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the positive factor : ");
	int n=ob.nextInt();
	System.out.println(" positive factor : ");
  for(int i=1;i<=n;++i){
	  if(n%i==0){
		  System.out.println(i);
	  }
  }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factors_Positive obj=new Factors_Positive();
		obj.fac_pos();
	}

}
