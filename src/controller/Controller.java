package controller;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.ModelSwim;
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
		if (isWetStr.equals("Yes"))
		{
			boolean isWet = true;
		}
		if (isWetStr.equals("No"))
		{
			boolean isWet = false;
		}
		boolean isWet = isWet;
		swimmer = new ModelSwim(name, isWet, isSwoll, fFreestyle);
	}
	
	public boolean validBool(String maybeBool)
	{
		boolean isValid = false;
		try
		{
			String.parseBool(maybeBool);
			isValid = true;
		}
		catch()
		{
			
		}
	}

}
