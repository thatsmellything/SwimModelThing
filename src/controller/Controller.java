package controller;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.ModelSwim;
public class Controller
{
	private ModelSwim swimmer;
	
	public Controller()
	{
		swimmer = new ModelSwim("Jensen", true, true, 25.19);
	}
	
	public void start()
	{
		swimmer = new ModelSwim(name, isWet, isSwoll, fFreestyle);
	}

}
