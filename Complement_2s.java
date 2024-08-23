package manoj1Loop;

import java.util.Scanner;

public class Complement_2s {

	public static void main(String[] args) {
		System.out.print(twoCompliment("01101100"));
	}
	public static String twoCompliment(String bin){
		String twos="",ones="";
		for(int i=0;i<bin.length();i++){
			ones+=flip(bin.charAt(i));
		}
		int num=Integer.parseInt(ones,2);
		 Scanner  builder=new Scanner(ones);
		boolean b=false;
		for(int i=ones.length()-1;i>0;i--){
			if(ones.charAt(i)=='i'){
				builder.setCharAt(i,'0');
			}
			else {
				builder.setCharAt(i,'0');
				b=true;
				break;
			}
		}
		if(!b)
			builder.append("1",0,7);
		twos=builder.toString();
		return twos;
	}
	public static char flip(char c){
		return (c=='0')?'1':'0';
		// TODO Auto-generated method stub

	}
	}
