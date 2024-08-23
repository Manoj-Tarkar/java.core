package manoj1Loop;

public class Complement_1s {
public int totalbits(int num){
	return (int)(Math.log(num)/Math.log(2))+1;
}
	void com_1s(int num){
	System.out.println("number :"+num);
	if(num<0){
		System.out.println("\n1s com :"+(~num));
	}
	else{
		int ones=((1<< totalbits(num))-1)^num;
		System.out.println("\n1s com :"+(ones));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complement_1s ob=new Complement_1s();
		ob.com_1s(23);
	}

}
