
import java.util.Scanner;
class  Atm
{
	int acctno=1234;
	double balance=10000;
	int pswd=111;
	Scanner sc=new Scanner(System.in);
	public void withdraw()
	{
		System.out.println("enter acctno");
		int an=sc.nextInt();
		if(acctno==an)
		{
			System.out.println("enter money");
			double money=sc.nextDouble();
			if(money<=balance)
			{
				System.out.println("enter pswd");
				int opswd=sc.nextInt();
				if(pswd==opswd)
				{
					balance=balance-money;
					System.out.println("take the notes& card");
				}
				else
				{
					System.out.println("incorrect pin");
				}


			}
			else
			{
				System.out.println("insufficient funds");
			}
		}
		else
		{
			System.out.println("enter valid account number");
		}
	}
	public void checkBalance()
	{
		System.out.println("enter acctno");
		int an=sc.nextInt();
		if(acctno==an)
		{
			
				System.out.println("enter pswd");
				int opswd=sc.nextInt();
				if(pswd==opswd)
				{
					System.out.println(balance);
					
				}
				else
				{
					System.out.println("incorrect pin");
				}

			}
			
		
		else
		{
			System.out.println("enter valid account number");
		}	
	}
	public void deposit()
	{
	
		System.out.println("enter acctno");
		int an=sc.nextInt();
		if(acctno==an)
		{
			System.out.println("enter money");
			double money=sc.nextDouble();
			if(money<=balance)
			{
				System.out.println("enter pswd");
				int opswd=sc.nextInt();
				if(pswd==opswd)
				{
					balance=balance+money;
					System.out.println("money successfully deposited ");
				}
				else
				{
					System.out.println("incorrect pin");
				}


			}
			else
			{
				System.out.println("insufficient funds");
			}
		}
		else
		{
			System.out.println("enter valid account number");
		}
	}
	
}
