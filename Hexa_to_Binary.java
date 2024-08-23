package manoj1Loop;

import java.util.Scanner;

public class Hexa_to_Binary {
	int hex;
	void getVal()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter hexa num : ");
		hex=Integer.parseInt(in.nextLine(),16);
	}
	void convert()
	{
		String bin = Integer.toBinaryString(hex);
	 System.out.println("bin num : "+bin);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hexa_to_Binary obj=new Hexa_to_Binary();
		obj.getVal();
		obj.convert();
	}

}
