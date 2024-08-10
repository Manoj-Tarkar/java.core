package manoj;

import java.util.*;

public class SimInterest {
	public static void main(String[] args) {
	Scanner ob =new Scanner(System.in);
	 System.out.println("Enter the coice ");
   int p,r,t;
   p=ob.nextInt();
   r=ob.nextInt();
   t=ob.nextInt();
   float si=(p*r*t)/100;
   System.out.println(si);
}
}