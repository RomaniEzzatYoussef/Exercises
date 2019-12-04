package utilities;

import java.util.Date;

public class Account
{
	private int id;
	private double balance;
	private double annualInterestRate;
	Date dateCreated = new Date();
	
	public Account() 
	{
		setId(0);
		setBalance(0);
		setAnnualInterestRate(0);
		dateCreated = new Date();
	}
	
	public Account(int id , double balance)
	{
		this.id = id;
		this.balance = balance;
	}
	
	public Account(int id , double balance ,  double annualInterestRate , Date date)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = date;
		
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
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
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return (getAnnualInterestRate() /100) / 12;
	}
	
	public double getMonthlyInterest()
	{
		return (getBalance() * getMonthlyInterestRate());
	}
	
	public double withdraw(double withdraw)
	{
		balance -= withdraw;
		return balance;
	}
	
	public double deposit(double deposit)
	{
		balance += deposit;
		return balance;
	}
	
}