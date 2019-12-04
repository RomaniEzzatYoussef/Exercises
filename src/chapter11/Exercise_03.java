package chapter11;

import java.util.Date;

/**
 *
 * 02/05/2019   6:01:16 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_03
 *
 */
public class Exercise_03 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Account myAccount = new Account();
		myAccount = new CheckingAccount();
//		myAccount = new SavingsAccount();
		
		System.out.println(myAccount.withdraw(110.15) + "\n" + myAccount.toString());
	
	}

}


class Account
{
	protected int accountNumber;
	protected double balance;
	protected double annualInterestRate;
	Date dateCreated = new Date();
	
	public Account()
	{
		this(07, 12.15, 5, new Date());
	}
	
	public Account(int accountNumber, double balance, double annualInterestRate, Date dateCreated)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated; 
	}

	public int getAccNum() 
	{
		return accountNumber;
	}

	public void setAccNum(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDataCreated()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return (getAnnualInterestRate() / 100 / 12);
	}
	
	public double getMonthlyInterest()
	{
		return (getBalance() * getMonthlyInterestRate());
	}
	
	public double withdraw(double withdraw) 
	{
		return (balance -= withdraw);
	}
	
	public double deposit(double deposit)
	{
		return (balance += deposit);
	}
	
	public String toString()
	{
		return "Account # " + getAccNum() + "\nBalance $" + getBalance() + " as of " + new Date() + ".";
	}
}

class CheckingAccount extends Account
{
	public CheckingAccount()
	{
		this(06, 1110.15d, 5, new Date());
	}
	
	public CheckingAccount(int accountNumber, double balance, double annualInterestRate, Date dateCreated)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated; 
	}
}

class SavingsAccount extends Account
{
	public SavingsAccount()
	{
		this(05, 40.15d, 5, new Date());
	}
	
	public SavingsAccount(int accountNumber, double balance, double annualInterestRate, Date dateCreated)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated; 
	}
	
	@Override
	public double withdraw(double withdraw) 
	{		
		if (0 > (balance - withdraw))
		{
			System.out.println("Overdraft Prevention! \nCurrent balance is ");
			return getBalance();
		}
		else
			return (balance -= withdraw);
	}
}
