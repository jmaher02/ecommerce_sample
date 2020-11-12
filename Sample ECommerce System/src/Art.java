/**
 * The Computer class
 * 
 * Designed to store information about products for purchase
 * 
 * A few assumptions: 
 *   - All Art are wall hangings
 *   - size is the diagonal measurement in inches
 */


public class Art extends Product
{
	private String title, artist, medium;
	private int size;

	public Art(int itemNum, String artTitle, String name, String artMedium, double price, int size)
	{
		super(itemNum, price, artTitle + " BY " + name);
		title = artTitle;
		artist = name;
		medium = artMedium;
		this.size = size;
	}

	public String displayCharacteristics()
	{
		String display = "\nITEM " + getItemNumber() + " " + getName() + "\t" + printPrice() + "\n";

		display += "\tMEDIUM: " + medium + "\n";
		display += "\tSIZE: " + size + "\n";
		
		return display;
	}
	
	public String showFeaturedPicture()
	{
		return getName() + "\n";
	}
}
