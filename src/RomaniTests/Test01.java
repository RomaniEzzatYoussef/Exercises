package RomaniTests;

import java.util.Scanner;

public class Test01 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual inerest rate: ");
        double annualInterestRate = input.nextDouble();
        
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();
        
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();
        
        double monthlyInterestRate = annualInterestRate / 1200;
        
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears *12;
        
        System.out.println("The Monthly Payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The Total Payment is $" + (int)(totalPayment * 100) / 100.0);
    }
}
