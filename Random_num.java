package manoj1Loop;

import java.util.*;

public class Random_num {
void random_num(){
	Scanner obj=new Scanner(System.in);
	Random rand=new Random();
	System.out.println("enter maximum range :");
	int MAX_range=obj.nextInt();
	for(int i=1;i<=5;i++){
		System.out.println(rand.nextInt(MAX_range));
	}
}
	public static void main(String[] args) {
		Random_num ob=new Random_num();
		ob.random_num();
		ob.random_num();
		ob.random_num();
	}

}
