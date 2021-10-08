package demo.view;

import javax.swing.JOptionPane;

public class Popup {
	public void displayMessage(String input)
	{
		JOptionPane.showMessageDialog(null,input);
	}
	
	public Double askQuestion(String input)
	{
		String answer = "";
		double doubleAnswer = 0;
		
		answer = JOptionPane.showInputDialog(null,input);
		System.out.println(answer);
		try
		{
			doubleAnswer = Double.parseDouble(answer);
		}
		
		catch(NumberFormatException e)
		{
			doubleAnswer = askQuestion("Invalid Try again");
		}
		Double.parseDouble(answer);
		System.out.println(doubleAnswer);
		return doubleAnswer;
		}
	public String askQuestionString(String input)
	{
		String answer = JOptionPane.showInputDialog(null,input);	
		if (answer == null)
		{
			answer = "";
		}
		return answer;
		
	}
}

