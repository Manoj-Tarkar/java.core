package manoj;

import java.util.Scanner;

public class Rem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
		 System.out.println("Enter the coice two no");
        int m1,m2;
        m1=ob.nextInt();
        m2=ob.nextInt();
        int t=m1%m2;
        System.out.println("Remainder "+t);
	}

}
