package model;

public class ModelSwim
{
	//--------Data Members----------
	private String name;
	private boolean isWet;
	private boolean isSwoll;
	private double fFreestyle;
	
	public ModelSwim()
	{
		
	}
	public ModelSwim(String name, boolean isWet, boolean isSwoll, double fFreestyle)
	{
		this.name = name;
		this.isWet = isWet;
		this.isSwoll = isSwoll;
		this.fFreestyle = fFreestyle;
	}
	//Getters
	public String name()
	{
		return name;
	}
	public boolean isWet()
	{
		return isWet;
	}
	public boolean isSwoll()
	{
		return isSwoll;
	}
	public double fFreestyle()
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
