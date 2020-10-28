/**
 * The Computer class
 * 
 * Designed to store information about products for purchase
 * 
 * A few assumptions: 
 *   - All RAM in GB
 *   - All hard drive in GB
 *   - Screen size is the diagonal measurement in inches
 */


public class Computer extends Product
{
	private String brand, cpu;
	private int memory, diskSpace; 
	private double screenSize;
	//private String[] pictures; // will display a variety of images of the product
	
	public Computer(int itemNum, String name, double price, String brand, String cpu, int ram, int hard_drive, double screen)
	{
		super(itemNum, price, name);
		this.brand = brand;
		this.cpu = cpu;
		memory = ram;
		diskSpace = hard_drive; 
		screenSize = screen;
	}

	public String displayCharacteristics()
	{
		String display = "\nITEM " + getItemNumber() + " " + getName() + "\t" + printPrice() + "\n";
		
		display += "\tBRAND: " + brand + "\n";
		display += "\tPROCESSOR: " + cpu + "\n\tMEMORY: " + memory + "GB\n";
		display += "\tHARD DRIVE: " + diskSpace + "GB\n";
		
		return display;
	}
	
	public String showFeaturedPicture()
	{
		return "" + brand + " " + getName() + "\n";
	}
	
	public String[] showImageGallery()
	{
		return null;
	}

}
