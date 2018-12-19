package controller;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.ModelSwim;  //Replace "model" with the package
// you want to access and replace "ModelSwim" with the class filename
public class Controller

{
	
	private ModelSwim swimmer;
	/**
	 *  Whack star star creates a java doc!
	 *  Builds the instance of the Controller.
	 */
	//public Controller()
	//{
	//	meSwimmer = new ModelSwim("Jensen", true, true, 25.19);
	//}
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		ModelSwim userSwim = new ModelSwim();
		//name
		String userName = JOptionPane.showInputDialog(null, "What is the persons name?");
		userSwim.setName(userName);
		
		String isWet = JOptionPane.showInputDialog(null, "Are they wet ALL THE TIME?");
		while (!validBool(isWet))
		{
			userIsWet = JOptionPane.showInputDialog(null, "Please input true or false");
			
		}
		
		userSwim.setIsWet(Boolean.parseBoolean(isWet));
		
		String isSwollString = JOptionPane.showInputDialog(null, "Are they swoll?");
		if(isSwollString.equals("yes"))
		{
			boolean isSwoll = true;
		}
		if(isSwollString.equals("No"))
		{
			boolean isSwoll = false;
		}
		boolean isSwoll = isSwoll;
		double fFreestyle = Double.parseDouble(JOptionPane.showInputDialog(null, "What is their 50 free time?"));
		
		

	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid= false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type a double value aka a decimal point boi");
		}
		return isValid;
	}
	
	public boolean validBool(String maybeBool)
	{
		boolean isValid = false;
		try
		{
			Boolean.parseBoolean(maybeBool);
			isValid = true;
		}
		catch(IllegalArgumentException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a boolean value IE treu or false ");
		}
		return isValid;
	}
	
	}


