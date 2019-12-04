package RomaniTests.new_test;

import java.util.Date;
import java.util.Scanner;

public class LoanClass 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter yearly interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years as an integer: ");
	    int numberOfYears = input.nextInt();
		
	    System.out.print("Enter loan amount, for example, 120000.95: ");
	    double loanAmount =  input.nextDouble();
	    
	    Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
	    
	    System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\n" + "The total payment is %.2f\n",
	    					loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	    
		input.close();
	}

}

class Loan 
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan() 
	{
		this(2.5, 1, 1000);
	}

	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) 
	{
	    this.annualInterestRate = annualInterestRate;
	    this.numberOfYears = numberOfYears;
	    this.loanAmount = loanAmount;
	    loanDate = new Date();
	}

	public double getAnnualInterestRate() 
	{
	    return annualInterestRate;
	}

	 
	public void setAnnualInterestRate(double annualInterestRate) 
	{
	    this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() 
	{
	    return numberOfYears;
	}

	
	public void setNumberOfYears(int numberOfYears) 
	{
	    this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() 
	{
	    return loanAmount;
	}

	public void setLoanAmount(double loanAmount)
	{
	    this.loanAmount = loanAmount;
	}

	public double getMonthlyPayment()
	{
	    double monthlyInterestRate = annualInterestRate / 1200;
	    double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
	    return monthlyPayment;    
	}

	public double getTotalPayment() 
	{
	    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
	    return totalPayment;    
	}

	public Date getLoanDate()
	{
	    return loanDate;  
	}
	
}

