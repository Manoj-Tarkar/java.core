package manoj1Loop;

import java.util.Scanner;

public class Palindrome_String {
void pal_string(){
	Scanner st=new Scanner(System.in);
	System.out.println("Enter the string value : ");
	String str=st.nextLine();
	String rev="";
	int len=str.length();
	for(int i=(len-1);i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(str.toLowerCase().equals(rev.toLowerCase())){
		System.out.println("palindrome string  : "+str);
	}
	else{
		System.out.println(" not palindrome string  : "+str);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome_String obj=new Palindrome_String();
		obj.pal_string();
	}

}
