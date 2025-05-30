import java.util.Scanner;
class Perfact
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int sum=0;
	int i;
	for( i=1;i<=n;i++);
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(n==sum)
	{
	System.out.println("perfact number");
	}
	else
	{
	System.out.println("not perfact number");
	}
	}
}
