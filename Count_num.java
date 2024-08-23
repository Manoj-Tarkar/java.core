package manoj1Loop;

import java.util.Scanner;

public class Count_num {
void count_num(){
	int count=0;
Scanner ob=new Scanner(System.in);
System.out.println("Enter the string ");
String text=ob.nextLine();
for(int i=0;i<text.length()-1;i++){
	if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
		count++;
}
System.out.println("total nuymber of word in string :"+(count+1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_num ob=new Count_num();
		ob.count_num();
	}

}
