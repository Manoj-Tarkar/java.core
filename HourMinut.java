package manoj;

import java.util.Scanner;

public class HourMinut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter time in hours :");
        int time=ob.nextInt();
        
        System.out.print("the time is minutes "+time*60);
	}

}
