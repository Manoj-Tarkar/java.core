package manoj1Loop;

import java.util.*;

public class Factors_nagative {
	void fac_nag(){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the nagative factor : ");
		int n=ob.nextInt();
		System.out.println(" nagative factor : ");
	 for(int i=n;i<=Math.abs(n);i++){
		 if(i==0){
			 continue;
		 }
		 else
		 {
			 if(n%i==0){
				 System.out.println(i);
			 }
		 }
	 }}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factors_nagative obj =new Factors_nagative();
		obj.fac_nag();
	}

}
