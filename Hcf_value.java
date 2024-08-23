package manoj1Loop;

import java.util.Scanner;

public class Hcf_value {
void hcv(){
	Scanner ob=new Scanner(System.in);
	int rem,hcf=0,div,divs;
	div=ob.nextInt();
	divs=ob.nextInt();
	do
	{
		rem=div%divs;
		if(rem==0){
			hcf=divs;
		}
			
		else{
			div=divs;
			divs=rem;
			}
	}while(rem!=0);
			System.out.print("HCF :"+hcf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hcf_value obj=new Hcf_value();
		obj.hcv();
	}

}
