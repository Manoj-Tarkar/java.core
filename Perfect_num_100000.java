package manoj1Loop;

public class Perfect_num_100000 {

	static boolean per_num(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1;i<=10000;i++)
{
	if(per_num(i))
		System.out.println(i);
	
}
	}

}
