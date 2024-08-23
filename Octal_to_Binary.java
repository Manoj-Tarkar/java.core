package manoj1Loop;

public class Octal_to_Binary {
void oct_bin(){
	int oct=14;
	System.out.println("Enter the oct num : "+oct);
	int dec=0,n=0;
	while(oct>0){
		int temp=oct%10;
		dec=(int) (dec+temp*Math.pow(8,n));
		oct/=10;
		n++;
	}
int bin[]=new int[20];
int i=0;
while(dec>0){
	int r=dec%2;
	bin[i++]=r;
	dec/=2;
}
System.out.println("bin num : ");
for(int j=i-1;j>=0;j--)
	System.out.print(bin[j]+"");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Octal_to_Binary obj =new Octal_to_Binary();
		obj.oct_bin();
	}

}
