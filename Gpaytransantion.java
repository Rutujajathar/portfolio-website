
import java.util.Scanner;
class Gpay1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int cp=123;
		System.out.println("Enter the contact number");
		long a=sc.nextLong();
		System.out.println("enter the money");
		double money=sc.nextDouble();
		System.out.println("Enter the password");
		int cpc=sc.nextInt();
		if(cpc==cp)
		{
		System.out.println("transantion successful");
		System.out.print( a +"\t"+money );
		
		}
		else
		{
			System.out.println("Invalid password");
		}
	}
}
