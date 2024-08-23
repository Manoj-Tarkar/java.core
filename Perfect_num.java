package manoj1Loop;
 import java.util.Scanner;

public class Perfect_num 
{/*
static boolean Check_per(int n){
	if(n==1)
		return false;
int sum=1;
for(int i=2;i<n;i++){
	if(n%i==0){
		sum+=i;
	}
}
if(sum==n)
	return true;
return false;
}
	void per_num(){
	Scanner ob=new Scanner(System.in);
	System.out.print("enter the num : ");
	int n=ob.nextInt();
	if(Check_per(n))
		System.out.print("perfect num : "+n);
	else
		System.out.print("not num : "+n);
}*/
	
	
	//System.out.println("second method : ");
	
void per_num(){
	long n, sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num : ");
	n=sc.nextLong();
	int i=1;
	while(i<=n/2)
	{
		if(n%i==0){
		sum=sum+i;	
		}
		i++;}
	if(sum==n){
		System.out.println("  perfect num "+n);
	}
	else {
		System.out.println(" not perfect num "+n);
	}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perfect_num obj=new Perfect_num();
		obj.per_num();
		obj.per_num();
		obj.per_num();
	}

}
