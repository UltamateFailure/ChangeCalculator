package demo.controller;

//imports
import java.util.Scanner;

public class Controller {
	
	//data members
	private Scanner input;
	
	
	
	//constructor
	public Controller()
	{
		this.input = new Scanner(System.in);
	}
	
	//main
	public void start()
	{
		System.out.println("What is owed? ");
		double total = (input.nextDouble());
		System.out.println("What do you have? ");
		double moneyHave  = input.nextDouble();
		changeCalc(total, moneyHave);
		
		
	}
	
	//Calculates the change
	private void changeCalc(double total, double moneyHave)
	{
		Double output = 0.0;
		if (moneyHave - total >= 0)
		{
			output = moneyHave - total;
			output = Math.round(output*100.0000000)/100.00000000;
			System.out.println("Your change is $" + output);
			dollarCount(output);
		}
		else
		{
			output = total - moneyHave;System.out.println("Your owe " + output + " more. ");
			output = 0.0;
		}
		
	}
	
	//calculates how many of each currency you need for change
	private void dollarCount(double change)
	{
		/// the rounding needs to happen because doubles can't hold base 10
		change = Math.round(change*100.00)/100.00;
		int hundred = 0;
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int ones = 0;
		int quater = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		if (change > 0)
		{
			while (change - 100 >= 0)
			{
				hundred = hundred + 1;
				change = change -100.0;
			}
			while (change - 50 >= 0)
			{
				fifty = fifty + 1;
				change = change -50.0;
			}
			while (change - 20 >= 0)
			{
				twenty = twenty + 1;
				change = change -20.0;
			}
			while (change - 10 >= 0)
			{
				ten = ten + 1;
				change = change - 10.0;
			}
			while (change - 5 >= 0)
			{
				five = five + 1;
				change = change - 5.0;
			}
			while (change - 1 >= 0)
			{
				ones = ones + 1;
				change = change - 1.0;
			}
			while (change - 0.25 >= 0)
			{
				quater = quater + 1;
				change = change - 0.25;
				change = Math.round(change*100.00)/100.00;
			}
			while (change - 0.10 >= 0)
			{
				dime = dime + 1;
				change = change - 0.10;
				change = Math.round(change*100.00)/100.00;
			}
			while (change - 0.05 >= 0)
			{
				nickel = nickel + 1;
				change = change - 0.05;
				change = Math.round(change*100.00)/100.00;
			}
			while (change - 0.01 >= 0)
			{
				penny = penny + 1;
				change = change - 0.01;
				change = Math.round(change*100.00)/100.00;
			}
			
			
			//this prints the results of the counting
			if (hundred > 0)
			{
				if (hundred > 1)
				{
					System.out.println(hundred + " hundreds");
				}
				else
				{
					System.out.println(hundred + " hundred");
				}
			}
			if (fifty > 0)
			{
				if (fifty > 1)
				{
					System.out.println(fifty + " fifties");
				}
				else
				{
					System.out.println(fifty + " fifty");
				}
			}
			if (twenty > 0)
			{
				if (twenty > 1)
				{
					System.out.println(twenty + " twenties");
				}
				else
				{
					System.out.println(twenty + " twenty");
				}
			}
			if (ten > 0)
			{
				if (ten > 1)
				{
					System.out.println(ten + " tens");
				}
				else
				{
					System.out.println(ten + " ten");
				}
				
			}
			if (ones > 0)
			{
				if (ones > 1)
				{
					System.out.println(ones + "ones");
				}
				else
				{
					System.out.println(ones + "one");
				}
			}
			if (quater > 0)
			{
				if (quater > 1)
				{
					System.out.println(quater + " quaters");
				}
				else
				{
					System.out.println(quater + " quater");
				}
			}
			if (dime > 0)
			{
				if (dime > 1)
				{
					System.out.println(dime + " dimes");
				}
				else
				{
					System.out.println(dime + " dime");
				}
			}
			if (nickel > 0)
			{
				if (nickel > 1)
				{
					System.out.println(nickel + " nickels");
				}
				else
				{
					System.out.println(nickel + " nickels");
				}
			}
			if (penny > 0)
			{
				if (penny > 1)
				{
					System.out.println(penny + " pennies");
				}
				else
				{
					System.out.println(penny + " penny");
				}
			}
		}
	}
}
