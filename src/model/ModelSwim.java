package model;

public class ModelSwim
{
	//--------Data Members----------
	private String name;
	private boolean isWet;
	private boolean isSwoll;
	private double fFreestyle;
	/**
	 * Default constructor for after the fact customization
	 * aka i don't know the info yet
	 * Initialize the data member with bad values that you will notice and can change later
	 */
	public ModelSwim()
	{
	this.name = "Jensen";
	this.isWet = true;
	this.isSwoll = true;
	this.fFreestyle = 25.19;
	}
	/**
	 * Better constructor when i know information for the swim program
	 * @param name
	 * @param isWet
	 * @param isSwoll
	 * @param fFreestyle
	 */
	public ModelSwim(String name, boolean isWet, boolean isSwoll, double fFreestyle)
	{
		this.name = name;
		this.isWet = isWet;
		this.isSwoll = isSwoll;
		this.fFreestyle = fFreestyle;
	}
	//Getters
	public String getName()
	{
		return name;
	}
	public boolean getIsWet()
	{
		return isWet;
	}
	public boolean getIsSwoll()
	{
		return isSwoll;
	}
	public double getfFreestyle()
	{
		return fFreestyle;
	}
	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setIsWet(boolean isWet)
	{
		this.isWet = isWet;
	}
	public void setIsSwoll(boolean isSwoll)
	{
		this.isSwoll = isSwoll;
	}
	public void setfFreestyle(double fFreestyle)
	{
		this.fFreestyle = fFreestyle;
	}
	
	public String toString()
	{
		String description = "Your swimmers name is " + name + " they are strng?" + isSwoll + " Are they wet? " + isWet + " what is their fifty free time? " + fFreestyle;
		return description;
	}

}
