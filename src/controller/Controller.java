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
	public Controller()
	{
		swimmer = new ModelSwim("Jensen", true, true, 25.19);
	}
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		String name = JOptionPane.showInputDialog(null, "What is the persons name?");
		String isWetStr = JOptionPane.showInputDialog(null, "Are they wet ALL THE TIME?");
		if(isWetStr.equals("yes"))
		{
			boolean isWet = true;
		}
		if(isWetStr.equals("No"))
		{
			boolean isWet = false;
		}
		boolean isWet = isWet;
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
		
		
		swimmer = new ModelSwim(name, isWet, isSwoll, fFreestyle);
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
	
	}


