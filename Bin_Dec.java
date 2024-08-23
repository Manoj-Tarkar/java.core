package manoj1Loop;

import java.util.Scanner;

public class Bin_Dec {
void bin_dec(){
Scanner ob=new Scanner(System.in);
int n,n1,p=1;
int j,i=1,d = 0,dec=0;

n=ob.nextInt();
n1=n;
for(j=n;j>0;j=j/10){
	d=j%10;
	if(i==1)
		p=p*1;
		else
			p=p*2;
			dec=dec+(d*p);
			i++;
		}
		System.out.println("bina  "+d);
		System.out.println("dec "+dec);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bin_Dec obj=new Bin_Dec();
		obj.bin_dec();
	}

}
