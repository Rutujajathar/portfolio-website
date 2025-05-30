
class Pattern
{
	public static void main(String[]args)
	{
	int a=1;
	for(int i=1;i<=5;i++)
	{
	int b=a+i-1;
	for(int j=1;j<=5;j++)
	{
		if(i>=j)
		{
		if(i%2==1)
	
			System.out.print("\t"+ a );
		
		else
		
			System.out.print("\t"+  b );
			a++;
			b--;
		}
	}
	System.out.println( );
	}
	}

}
