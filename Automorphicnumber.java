
class Automorphicnumber 
{
	public static void main(String[] args) 
	{
		int num=76;
		int temp=num;
		int sq=num*num;
		int sum=0;
		int ncount=0;
		while(num>0);
		{
			ncount++;
			num/=10;
		}
		num=temp;
		for(int i=1;i>ncount;i++)
		{
			sum=sum*10+sq/10;
			sq/=10;
		}
		int rev=0;
			while(num>0)
		{
			rev=rev*10+sum%10;
			sum/=10;
		}
		if(rev==num)
			System.out.println("Automorphic number");
		else
			System.out.println("not Automorphicnumber");

	}
}
