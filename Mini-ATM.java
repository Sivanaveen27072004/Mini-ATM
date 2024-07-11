import java.util.Scanner;
abstract class Bank
{
	double balance;

	abstract void withdraw(double amount);
	abstract void deposit(double amount);

	public void checkBalance()
	{
		System.out.println("Balance availaible is "+balance);
	}
}

class SBI extends Bank 
{
	@Override
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			if(amount%500==0 && amount>0)
			{
				double updated_balance = balance - amount;
				balance = updated_balance;
				System.out.println("Withdrawn successfull of amount "+amount+" and updated balance is :"+updated_balance);
			}
			else 
			{
				System.out.println("Invalid amount");
			}
		}
		else 
		{
			System.out.println("Insufficient balance please deposit amount");
		}
	}

	@Override
	public void deposit(double amount)
	{
		if(amount<=4000 && amount>0)
		{
			double updated_balance = balance + amount;
			balance = updated_balance;
			System.out.println("Deposit successfull of "+amount+" and updated balance is "+updated_balance);
		}
		else 
		{
			System.out.println("Invalid amount please deposit again");
		}
	}
}

class HDFC extends Bank 
{
	@Override
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			if(amount>0 && amount%1000==0)
			{
				double updated_balance = balance - amount;
				balance = updated_balance;
				System.out.println("Withdrawn successfull of amount "+amount+" and updated balance is :"+updated_balance);
			}
			else 
			{
				System.out.println("Invalid amount");
			}
		}
		else 
		{
			System.out.println("Insufficient balance please deposit amount");
		}
	}

	@Override
	public void deposit(double amount)
	{
		if(amount>0 && amount<=5000)
		{
			double updated_balance = balance + amount;
			balance = updated_balance;
			System.out.println("Deposit successfull of "+amount+" and updated balance is "+updated_balance);
		}
		else 
		{
			System.out.println("Invalid amount please deposit again");
		}
	}
}

class Axis extends Bank
{
	@Override
	public void withdraw(double amount)
	{
		if(amount<=balance)
		{
			if(amount>0 && amount%100==0)
			{
				double updated_balance = balance - amount;
				balance = updated_balance;
				System.out.println("Withdrawn successfull of amount "+amount+" and updated balance is :"+updated_balance);
			}
			else 
			{
				System.out.println("Invalid amount");
			}
		}
		else 
		{
			System.out.println("Insufficient balance please deposit amount");
		}
	}

	@Override
	public void deposit(double amount)
	{
		if(amount>0 && amount<=10000)
		{
			double updated_balance = balance + amount;
			balance = updated_balance;
			System.out.println("Deposit successfull of "+amount+" and updated balance is "+updated_balance);
		}
		else 
		{
			System.out.println("Invalid amount please deposit again");
		}
	}	
}

class BankDriver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		SBI s = new SBI();
		HDFC h = new HDFC();
		Axis a = new Axis();

		while(true)
		{
			System.out.println("----Welcome to Bank------\n");
			System.out.println("Please choose from below bank");
			System.out.println("1.SBI");
			System.out.println("2.HDFC");
			System.out.println("3.Axis");
			int choice = sc.nextInt();
			if(choice==1)
			{
				System.out.println("\t1.Withdraw");
				System.out.println("\t2.Deposit");
				System.out.println("\t3.Check balance");
				System.out.println("\tPlease choose from above option");
				int ch = sc.nextInt();
				if(ch==1)
				{
					System.out.println("How much amount u want to withdraw");
					double amount = sc.nextDouble();
					s.withdraw(amount);
				}
				else if(ch==2)
				{
					System.out.println("How much amount u want to deposit");
					double amount = sc.nextDouble();
					s.deposit(amount);
				}
				else if(ch==3)
				{
					s.checkBalance();
				}
				else 
				{
					System.out.println("Invalid option please choose from 1-2");
				}
			}
			else if(choice==2)
			{
				System.out.println("\t1.Withdraw");
				System.out.println("\t2.Deposit");
				System.out.println("\t3.Check balance");
				System.out.println("\tPlease choose from above option");
				int ch = sc.nextInt();
				if(ch==1)
				{
					System.out.println("How much amount u want to withdraw");
					double amount = sc.nextDouble();
					h.withdraw(amount);
				}
				else if(ch==2)
				{
					System.out.println("How much amount u want to deposit");
					double amount = sc.nextDouble();
					h.deposit(amount);
				}
				else if(ch==3)
				{
					h.checkBalance();
				}
				else 
				{
					System.out.println("Invalid option please choose from 1-2");
				}
			}
			else if(choice==3)
			{
				System.out.println("\t1.Withdraw");
				System.out.println("\t2.Deposit");
				System.out.println("\t3.Check balance");
				System.out.println("\tPlease choose from above option");
				int ch = sc.nextInt();
				if(ch==1)
				{
					System.out.println("How much amount u want to withdraw");
					double amount = sc.nextDouble();
					a.withdraw(amount);
				}
				else if(ch==2)
				{
					System.out.println("How much amount u want to deposit");
					double amount = sc.nextDouble();
					a.deposit(amount);
				}
				else if(ch==3)
				{
					a.checkBalance();
				}
				else 
				{
					System.out.println("Invalid option please choose from 1-2");
				}
			}
			else 
			{
				System.out.println("Invalid option please select from 1-3");
			}
		}
	}
}
