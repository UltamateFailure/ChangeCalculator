package demo.controller;


//imports
//import java.util.Scanner;
import demo.view.Popup;

public class Controller {
	//data members
	private Popup view;
	private double output;
	
	
	
	//constructor
	public Controller()
	{
		this.view = new Popup();
	}
	
	//main
	public void start()
	{
		Double total = view.askQuestion("What is owed?");
		double moneyHave = view.askQuestion("How much do you have?");
		changeCalc(total, moneyHave);
		
	}
	
	//Calculates the change
	private void changeCalc(double total, double moneyHave)
	{
		output = 0.0;
		if (moneyHave - total >= 0)
		{
			output = moneyHave - total;
			output = Math.round(output*100.0000000)/100.00000000;
			view.displayMessage("Your change is $" + output);
			dollarCount(output);
		}
		else
		{
			output = total - moneyHave;
			output = Math.round(output*100.0000000)/100.00000000;
			view.displayMessage("You owe " + output + " more.");
			output = 0.0;
			start();
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
		repeatDisplay(hundred, fifty, twenty, ten, five, ones, quater, dime, nickel, penny);
		}
	}
	
	//Displays the final calculations
	private void repeatDisplay(int hundred, int fifty, int twenty, int ten, int five, int one, int quater, int dime, int nickel, int penny)
	{
		String answer = view.askQuestionString("Change: " + output + "\nChange in currency\nHundreds: " + hundred + "\nFifty: " + fifty + "\nTwenty: " + twenty + "\nTen: " + ten + 
				"\nFive: " + five + "\nOne: " + one + "\nQuarter: " + quater + "\nDime: " + dime + "\nNickel: " + nickel + 
				"\nPenny: " + penny + "\nType in 1 to reapet or 2 to stop");
		System.out.println(answer);
		if (answer.equals("1"))
		{
			start();
		}
		else if (answer.equals("2"))
		{
			System.exit(0);
		}
		else
		{
			repeatDisplay(hundred, fifty, twenty, ten, five, one, quater, dime, nickel, penny);
		}
		
	}
	
	
}
