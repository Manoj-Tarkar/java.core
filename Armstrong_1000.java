package manoj1Loop;

public class Armstrong_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1,arm;
System.out.println("arm between 1 to 1000");
while(i<1000){
	arm=armstrong(i);
	if(arm==i)
		System.out.println(i);
	i++;
}
	}
static int armstrong(int num)
{
	int x,a=0;
	while(num!=0){
		x=num%10;
		a=a+(x*x*x);
		num/=10;
	}
	return a;
}
}
