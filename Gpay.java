import java.util.Scanner;
class Gpay
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int cp=123;
		System.out.println("Enter the current password");
		int a=sc.nextInt();
		if(cp==a)
		{
		System.out.println("enter the new password");
		 cp=sc.nextInt();
		System.out.println("change password");
		}
	}
}
