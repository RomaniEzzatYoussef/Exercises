package chapter11;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * 05/05/2019   9:06:44 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_08
 *
 */
public class Exercise_08 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Account11.setAnnualInterestRate(1.5);;
		
		Account11 account = new Account11("George", 1122, 1000);
		
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println("Name: " + account.getCustomerName());
	    System.out.println("Annual interest rate: " + Account11.getAnnualInterestRate());
	    System.out.println("Balance: " + account.getBalance());
	    
	    ArrayList<Transaction> list = account.getTransactions();
	    
	    System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");
	    
	    for (int i = 0; i < list.size(); i++) 
	    {
	    	Transaction transaction = (list.get(i));
	    	System.out.printf("%-35s%-15s%-15s%-15s\n", transaction.getDate(), transaction.getType(), transaction.getAmount(), transaction.getBalance());
	    }		
	}

}

class Transaction extends Account11
{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction() 
	{
		this('N', 0, 0, "Default");
	}
	
	public Transaction(char type, double amount, double balance, String description) 
	{
		date = new Date();
		this.setType(type);
		this.setAmount(amount);
		this.setBalance(balance);
		this.setDescription(description);
	}

	public Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}

class Account11
{
	private int id;
	private String customerName;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	public Account11() 
	{
		dateCreated = new Date();
	}
	
	public Account11(String name, int id , double balance)
	{
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	public Account11(int id , String customerName, double balance)
	{
		this.id = id;
		this.customerName = customerName;
		this.balance = balance;
		dateCreated = new Date();
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
	
	public void withdraw(double amount)
	{
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, ""));

	}
	
	public void deposit(double amount)
	{
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, ""));

	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account11.annualInterestRate = annualInterestRate;
	}
	
}