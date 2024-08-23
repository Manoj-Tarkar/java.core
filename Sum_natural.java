package manoj1Loop;

import java.util.Scanner;

public class Sum_natural {
void sum_nat(){
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	int s=0;
	for (int i=1;i<=n;i++){
		s=s+i;}
     System.out.println(s);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_natural obj1=new Sum_natural();
		obj1.sum_nat();
	}

}

