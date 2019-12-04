package chapter09;

import java.util.Scanner;

/**
 * Algebra: 2 x 2 linear equations
 * Design a class named LinearEquation for a 2 x 2 system of linear equations:
 * The class contains:
 * Private data fields a, b, c, d, e, and f. 
 * A constructor with the arguments for a, b, c, d, e, and f.
 * Six getter methods for a, b, c, d, e, and f.
 * A method named isSolvable() that returns true if ad - bc is not 0.
 * Methods getX() and getY() that return the solution for the equation. 
 * Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. 
 * If ad - bc is 0, report that “The equation has no solution.”
 */
public class Exercise_11 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter for a, b , c, d, e, f: ");
		LinearEquation equation = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		
		if (equation.isSolvable())
			System.out.println("(" + equation.getX() + "," + equation.getY() + ")");
		else
			System.out.println("The equation has no solution.");
		
		input.close();
	}
}

class LinearEquation
{
	private double a , b , c , d, e ,f;
	
	public LinearEquation(double a , double b , double c , double d , double e , double f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() 
	{
		return a;
	}

	public void setA(double a) 
	{
		this.a = a;
	}

	public double getB() 
	{
		return b;
	}

	public void setB(double b)
	{
		this.b = b;
	}

	public double getC() 
	{
		return c;
	}

	public void setC(double c) 
	{
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) 
	{
		this.d = d;
	}

	public double getE() 
	{
		return e;
	}

	public void setE(double e) 
	{
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) 
	{
		this.f = f;
	}
	
	public boolean isSolvable()
	{
		if ((getA() * getD()) - (getB() * getC()) != 0)
			return true;
		return false;
	}
	
	public double getX()
	{
		return ((getE() * getD()) - (getB() * getF())) / ((getA() * getD()) - (getB() * getC()));
	}
	
	public double getY()
	{
		return ((getA() * getF()) - (getE() * getC())) / ((getA() * getD()) - (getB() * getC()));
	}
}
