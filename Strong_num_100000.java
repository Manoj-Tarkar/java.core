package manoj1Loop;

import java.util.Scanner;

public class Strong_num_100000 {
void strong_num(){
	for(int i=1;i<=100000;i++){
		if(isItStrong(i))
		{
			System.out.println(i);
		}
		
	}
}
static boolean isItStrong(int num){
	int no=num;
	int sum=0;
	while(no>0){
		int digit=no%10;
		sum+=fact(digit);
		no=no/10;
	}
	return sum==num;
}
	private static int fact(int digit) {
		int f=1;
		for(int j=digit;j>1;j--){
			f*=j;
		}
		return f;
}
	public static void main(String[] args) {
		// TODO Auto-generated= method stub
		Strong_num_100000  obj=new Strong_num_100000 ();
		obj.strong_num();
	}

}
