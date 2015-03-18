// Author : Enes Kemal Ergin
/*
	RationalNumber Class
		It get's rational number and gives you numerator and denominator 
*/
public class RationalNumber{
	private int numerator, denominator;
	public RationalNumber(int number, int denom){
		if(denom == 0)
			denom = 1;

		if(denom < 0 )
		{
			number = number * -1;
			denom = denom * -1;
		}
		numerator = number;
		denominator = denom;

		reduce(); // this is another class
	}
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	public RationalNumber reciprocal(){
		return new RationalNumber(denominator, numerator);
	}
	public RationalNumber add (RationalNumber op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;
		
		return new RationalNumber (sum, commonDenominator);
	}
	public RationalNumber subtract (RationalNumber op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;
		
		return new RationalNumber (difference, commonDenominator);
	}
	public RationalNumber multiply (RationalNumber op2)
	{
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		
		return new RationalNumber (numer, denom);
	}
	public RationalNumber divide (RationalNumber op2)
	{
		return multiply(op2.reciprocal());
	}
	public boolean isLike (RationalNumber op2)
	{
		return ( numerator == op2.getNumerator() &&
				denominator == op2.getDenominator() );
	}
	public String toString(){
		String result;
		if(numerator == 0)
			result = "0";
		else
			if(denominator == 1)
				result = numerator + "";
			else
				result = numerator + "/" + denominator;
		return result;
	}
	private void reduce ()
	{
		if (numerator != 0)
		{
			int common = gcd (Math.abs(numerator), denominator);
			numerator = numerator / common;
			denominator = denominator / common;
		}
	}
	private int gcd ( int num1, int num2)
	{
		while (num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		
		return num1;
	}
}